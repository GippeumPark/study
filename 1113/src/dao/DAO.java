package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//DAO 클래스들이 가져야 할 공통의 것들을 정의한 클래스
//직접 사용하지는 않을 거라서 추상 클래스로 만듬
public abstract class DAO {
	//DAO 클래스에서 필요한 변수 생성  (DAO클래스에서 무조건 있어야 하는 거라 미리 만들어 놓음)
	protected Connection con;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	//드라이버 클래스 로드(딱 한번 만 실행되면 됨)
	////맨 처음 1번만 수행해야 하는 내용은 static 블럭에 작성
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.printf("클래스 로드 성공\n");
		}catch (Exception e) {
			System.out.printf("클래스 로드 실패: %s\n", e.getMessage());
		}
	}	
		//데이터베이스 접속 메소드
		protected void connect() {
			try {
				//접속
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ppeum" + "?serverTimezone=UTC", "root", "1111");
				System.out.printf("데이터베이스 접속 성공\n");
			} catch (Exception e) {
				System.out.printf("%s\n", e.getMessage());
			}
			
		}
		
		//데이터베이스 자원 해제 메소드
		protected void close() {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
				System.out.printf("자원 해제 성공\n");
			}catch (Exception e) {
				System.out.printf("자원 해제 실패: %s\n", e.getMessage());
			}
			
		}
		
}
