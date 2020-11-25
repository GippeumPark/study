import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ToDoCRUD {

	public static void main(String[] args) {
		//1.드라이버 클래스 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.printf("클래스 로드 성공\n");
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
		}
		
		
		
		
		
		//2.Connection 객체를 생성하고 SQL을 실행
		try {
		//데이터베이스 접속 객체 생성	
			Connection con = 
					DriverManager.getConnection(
							"jdbc:oracle:thin:@192.168.10.101:1521:xe",
							"c##user06", "user06");
			System.out.printf("데이터베이스 접속 성공\n");
			//사용할 sql을 생성 - PreparedStatement 객체를 생성
			PreparedStatement pstmt = con.prepareStatement("insert into todo(num, content, regdata)"
					+ " values(todo_seq.nextval, ?, sysdate)");
			//?가 있는 경우 값을 바인딩
			pstmt.setString(1, "내용");
			//실행
			pstmt.executeUpdate();
			
			//정리
			pstmt.close();
			con.close();
			
		}catch(Exception e) {
			System.out.printf("DB 사용 실패: %s\n", e.getMessage());
		}
	}

}
