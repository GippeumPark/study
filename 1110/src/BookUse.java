import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class BookUse {

	public static void main(String[] args) {
		//1. 드라이버 클래스 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.printf("드라이버 클래스 로드 성공\n");
		}catch(Exception e) {
			System.out.printf("로드 실패: %s\n", e.getMessage());
		}
		
		//2. SQL 실행
		try {
			Connection con = DriverManager.getConnection(
							"jdbc:oracle:thin:@192.168.10.101:1521:xe",
							"c##user20", "user20");
			System.out.printf("데이터베이스 접속 성공\n");
			
/*			PreparedStatement pstmt = con.prepareStatement(
					"Insert into book(id, title," + "aurhor, price, publishdate)"
							+ " values(?, ?, ?, ?, sysdate)");
//SQL 값을 바인딩
			pstmt.setInt(1, 1);
			pstmt.setString(2,  "방탄에대하여");
			pstmt.setString(3, "박아미");
			pstmt.setInt(4, 7777777);
*/
		
//insert delete 변경은 여기만 하면 됨
/*			PreparedStatement pstmt = con.prepareStatement("update book "
					+ "set price=?," + "publishdate=?" +
					" where id=?");
			pstmt.setInt(1, 36000);
			//날짜 객체를 생성
			Calendar cal =
					new GregorianCalendar(2010, 10, 5);
			java.sql.Date date =
					new java.sql.Date(cal.getTimeInMillis());
			pstmt.setDate(2, date);
			pstmt.setInt(3, 1);
*/		
	
//insert 값 삭제
/*			PreparedStatement pstmt = con.prepareStatement(
					"delete from book where id = ?");
			pstmt.setInt(1, 1);
*/		
			
			
			PreparedStatement pstmt = con.prepareStatement("select* from sample");
			//select 구문 실행
			ResultSet rs = pstmt.executeQuery();
			//읽어낸 데이터 전부 읽기
			List<Sample>list = new ArrayList<>();
			while(rs.next()) {
				Sample sample = new Sample();
				sample.setNum(rs.getInt("num"));
				sample.setName(rs.getString("name"));
				list.add(sample);
				
			}
			
			for(Sample sample : list) {
				System.out.printf("%s\n", sample);
			}
			
			
			
			
			//읽기 객체를 해제
			rs.close();
						
			//SQL 값 실행
			int result = pstmt.executeUpdate();
			
			//결과 확인
			if(result > 0) {
				System.out.printf("삽입 성공\n");
			}else {
				System.out.printf("삽입 실패\n");
			}
			
			//SQL객체 해제
			pstmt.close();
			
			//데이터베이스 연결 해제
			con.close();
			
		}catch(Exception e) {
			System.out.printf("SQL 실행 실패: %s\n", e.getMessage());
		}
		
	
	}

}
