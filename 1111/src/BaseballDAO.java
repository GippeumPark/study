import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BaseballDAO {
	//맨 처음 1번만 수행되는 코드를 만들 때 사용
	static {
		try {
			//드라이버 클래스 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.printf("드라이버 로드 성공: \n");		
		} catch (Exception e) {
			System.out.printf("드라이버 로드 실패: %s\n", e.getMessage());
		}
	}
	
	//데이터베이스 연결 객체를 저장할 변수
	private Connection con;
	//SQL 실행 객체를 저장할 변수
	private PreparedStatement pstmt;
	//select 구문의 결과를 저장할 변수
	private ResultSet rs;
	
	//데이터베이스 연결 주행해주는 메소드
	public void connect() {
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.10.101:1521:xe",
					"c##user06", "user06");
			System.out.printf("데이터베이스 로드 성공: \n");
		} catch (Exception e) {
			System.out.printf("데이터베이스 로드 실패: %s\n", e.getMessage());
		}
	}
	
	//데이터베이스 사용 객체를 정리해주는 메소드
	public void close() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		} catch (Exception e) {
			System.out.printf("데이터베이스 정리 실패: %s\n", e.getMessage());
			e.printStackTrace();
		}
	}
	
	//public 응답할형식 이름(어떤걸 받아서 처리){}
	public boolean list(BaseballDTO baseball) {
		boolean result = false;
		
		//데이터베이스 연결
		connect();
		try {
			//실행할 SQL 생성
			//insert into baseball(num, name, build, image)
			//values(baseball_seq.nextval, 'ddd', '1952-11-11', image)
			
			pstmt = con.prepareStatement(
					"insert into baseball(num, name, build, image) " + "values(baseball_seq.nextval, ?, ?, ?)");
			
			//값을 바인딩
			pstmt.setString(1, baseball.getName());
			pstmt.setDate(2, baseball.getBuild());
			
			if(baseball.getImage() !=null) {
				//파일 이름을 가지고 File 객체를 생성
				//파일에 동영상을 올릴 경우 확장자까지 작성해 줘야함
				File f = new File(baseball.getImage());
				//파일의 내용을 읽을 수 있도록 스트림으로 생생성
				FileInputStream fis = new FileInputStream(f);
				//값을 바인딩
				pstmt.setBinaryStream(3, fis, (int)f.length());
			}else {
				pstmt.setBinaryStream(3, null);
			}
			
			
			//SQL 실행
			int r = pstmt.executeUpdate();
			if(r > 0) {
				result = true;
			}
			
			
			
		} catch (Exception e) {
			System.out.printf("데이터 삽입 실패:  %s\n", e.getMessage());
			e.printStackTrace();
		}	
		
		//데이터베이스 자원 해제
		close();
		return result;
	
	}
	
	//전체 데이터 가져오기
	//public 어떻게 하나로 만들지 이름(무엇을 받아서 처리) {
	public List<BaseballDTO> getList() {
		//List가 리턴인 경우는 List 객체를 생성하고 미리 리턴
		List<BaseballDTO> list = new ArrayList<BaseballDTO>();
		//데이터베이스 연결
		connect();
		
		//SQL 생성해서 실행하고 결과 생성
		try {
			//sql 생성 - 여러 개의 데이터를 가져올 때 정렬을 해주는 것이 좋음
			pstmt = con.prepareStatement(
					"select * from baseball order by num");
			//sql 실행
			rs = pstmt.executeQuery();
			//결과 읽기
			while(rs.next()) {
				//하나의 행을 저장할 객체를 생성
				BaseballDTO baseball = new BaseballDTO();
				baseball.setNum(rs.getInt("num"));
				baseball.setName(rs.getString("name"));
				baseball.setBuild(rs.getDate("build"));
			//blob 읽어오기
				InputStream is = rs.getBinaryStream("image");
			//파일 이름을 랜덤하게 생성해서 저장
				String filename = UUID.randomUUID().toString();
				FileOutputStream fos =
						new FileOutputStream("./" + filename);
				//데이터를 읽어서 파일에 저장
				while(true) {
					byte []b = new byte[1024];
					int len = is.read(b);
					if(len <=0) {break;}
					fos.write(b, 0, len);
					
				}
				fos.close();
				
				list.add(baseball);
			}
					
		} catch (Exception e) {
			System.out.printf("데이터 전체 조회 실패: %s\n", e.getMessage());
			e.printStackTrace();
		}
		
		//데이터베이스 연결 해제
		close();
		return list;
		
	}
	//상세보기를 위한 메소드
	//public 리턴타입 메소드이름(매개변수) {
	public BaseballDTO getBaseball (int num) {
		BaseballDTO	baseball = null;
		connect();
		try {
			pstmt = con.prepareStatement("select * from baseball where num = ?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				baseball = new BaseballDTO();
				baseball.setNum(rs.getInt("num"));
				baseball.setName(rs.getString("name"));
				baseball.setBuild(rs.getDate("build"));
			}
		} catch (Exception e) {
			System.out.printf("데이터 1개 조회 실패: %s\n", e.getMessage());
			e.printStackTrace();
		}
		
		
		
		close();
		return baseball;
		
	}
	
	//데이터 수정을 위한 메소드
	public Boolean update(BaseballDTO baseball) {
		Boolean result = false;
		connect();
		
		try {
				//num을 가지고 name 과 build를 수정하는 SQL
				pstmt = con.prepareStatement("update baseball " + "set name=?, build=?" + "where num = ?");
					pstmt.setString(1, baseball.getName());
					pstmt.setDate(2, baseball.getBuild());
					pstmt.setInt(3, baseball.getNum());
		} catch (Exception e) {
			System.out.printf("데이터 수정 실패: %s\n", e.getMessage());
			e.printStackTrace();
		}
		
		
		
		close();
		return result;
		
	}
	//데이터 삭제를 위한 메소드
	public Boolean Delete(int num) {
		Boolean result = false;
		connect();
		
		try {
				//num을 가지고 name 과 build를 삭제하는 SQL
				pstmt = con.prepareStatement("delete from baseball " + "where num=?");
				
					pstmt.setInt(1,num);
					
					int r = pstmt.executeUpdate();
					if(r >= 0) {
						result = true;
					}	
						
		} catch (Exception e) {
			System.out.printf("데이터 삭제 실패: %s\n", e.getMessage());
			e.printStackTrace();
		}
		
			
		close();
		return result;
	}
	
}
