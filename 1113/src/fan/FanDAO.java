package fan;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import dao.DAO;

public class FanDAO extends DAO {
	//상세보기
	//기본키를 매개변수로 제공하고 그 행의 모든 정보를 리턴
	public Fan getFan(String id) {
		//1개를 리턴하는 메소드는 결과에 null을 대입해서 생성
		Fan fan = null;
		
		//데이터베이스 연결
		connect();
		try {
			pstmt = con.prepareStatement(
					"select * from fan where id = ?");
			//?에 실제 값을 바인딩
			pstmt.setString(1, id);
			
			//select 구문 실행 (값이 하나만 나오는지 두개이상 나올 수 있는지 생각해야 함, id는 절대 두개 나올 수 없음)
			rs = pstmt.executeQuery();
			//데이터가 있는 경우에만 수행
			if(rs.next()) {
				fan = new Fan();
				
				fan.setId(rs.getString("id"));
				fan.setPw(rs.getString("pw"));
				fan.setName(rs.getString("name"));
				fan.setLogin(rs.getDate("login"));
				fan.setLogout(rs.getDate("logout"));
			}
			
			
		}catch (Exception e) {
			System.out.printf("데이터 가져오기 실패: %s\n", e.getMessage());
			e.printStackTrace();
		}
		
		//데이터베이스 연결 해제
		close();

		//id에 해당하는 데이터가 없으면 null
		//있으면 그 정보를 리턴
		return fan;
	}

	//회원 가입 메소드
	//필요한 정보를 모두 줘야함
	public Boolean register(Fan fan){
		//결과를 리턴할 변수
		//값이 true일 경우만 리턴하게 만듦
		Boolean result = false;
		//데이터베이스 연결
		connect();
		try {
			//sql생성
			pstmt = con.prepareStatement("insert into fan(" + "id, pw, name," + "login, logout) " + "values(?, ?, ?, ?, ?)");
			//?에 값을 바인딩
			pstmt.setString(1, fan.getId());
			pstmt.setString(2, fan.getPw());
			pstmt.setString(3, fan.getName());
			pstmt.setDate(4, fan.getLogin());
			pstmt.setDate(5, fan.getLogout());
			
			//select 이외의 구문 실행
			//영향받은 행의 개수가 리턴
			//삽입은 1이상이 리턴되어야 성공
			//삭제, 수정 및 다른 구문은 0 이상이면 성공
			//지금은 삽입하는거라 1 이상이 되어야 해 if로 r이 0보다 클때 트루 리턴
			int r= pstmt.executeUpdate();
			if(r > 0){
				result = true;
			}
			
			
			
			
			
		}catch (Exception e) {
			System.out.printf("회원가입 실패: %s\n", e.getMessage());
			e.printStackTrace();
		}
		
		//데이터베이스 연결 해제
		close();
		
		return result;
	}
	
	//로그인 처리를 위한 메소드
	public Fan login(String id, String pw) {
		Fan fan = null;
		connect();
		try {
			//sql 생성
			pstmt = con.prepareStatement(
					"select * " + "from fan " + "where id=? and pw=?");
			//?에 실제 값을 바인딩
			pstmt.setString(1, id);
			pstmt.setString(2, pw);

			//select 구문 실행
			//로그인 시 pw는 저장하면 안되어 입력하지 않음
			rs=pstmt.executeQuery();
			
			//가져온 회원 정보를 fan에 저장
			if(rs.next()) {
				fan = new Fan();
				fan.setId(rs.getString("id"));
				fan.setName(rs.getString("name"));

				//로그인 한 날짜를 오늘 날짜로 수정
				Calendar cal = new GregorianCalendar();
				
				pstmt = con.prepareStatement(
						"update fan " + "set login=? " + "where id=?");
				pstmt.setDate(1, new Date(cal.getTimeInMillis()));
				
				pstmt.setString(2, id);
				pstmt.executeUpdate();
				
				
				
				
				
			}
			
		}catch (Exception e) {
			System.out.printf("로그인 실패: %s\n", e.getMessage());
			e.printStackTrace();
		}
		

		
		
		
		
		close();
		//null을 리턴하면 로그인 실패, 그렇지 않으면 로그인 성공
		return fan;
	}	
	
	
	
		//회원정보 수정을 위한 메소드 (회원가입 메소와 같은 구조고 update만 달라짐)
		
		public Boolean update(Fan fan){
			//결과 변수 생성
			Boolean result = false;
			//데이터베이스 연결
			connect();
			try {
				//SQL실행 객체 생성
				pstmt = con.prepareStatement(
						"update fan " + "set pw=?, name=? " + "where id=?");
				//?에 데이터 바인딩
				//nullpointerExciption이 생길 경우
				//pstmt 와 fan을 확인
				System.out.printf("%s\n", pstmt);
				System.out.printf("%s\n", fan);
				
				pstmt.setString(1, fan.getPw());
				pstmt.setString(2, fan.getName());
				pstmt.setString(3, fan.getId());
				
				//실행
				int r = pstmt.executeUpdate();  //정수로 실행할 경우
				if(r >= 0) {
					result = true;
				}
			} catch (Exception e) {
				System.out.printf("회원 정보 수정 실패:%s\n", e.getMessage());
				e.printStackTrace();
			}
			//데이터베이스 연결 해제
			close();
			return result;
						
		}

		//회원 정보 삭제
		
		public Boolean delete(String id) {
			//결과 변수 생성
			Boolean result = false;
			//데이터베이스 연결
			connect();
			try {
				//SQL실행 객체 생성
				//탈퇴 시, id의 값만 넣으면 됨
				pstmt = con.prepareStatement(
						"delete from fan " + "where id=?");
				//?에 데이터 바인딩			
				pstmt.setString(1, id);
				
				//실행
				int r = pstmt.executeUpdate();  //정수로 실행할 경우
				if(r >= 0) {
					result = true;
				}
			} catch (Exception e) {
				System.out.printf("회원 정보 삭제 실패:%s\n", e.getMessage());
				e.printStackTrace();
			}			
			//데이터베이스 연결 해제
			close();
			return null;
			
		}
		
}
