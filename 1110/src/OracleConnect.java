import java.sql.DriverManager;

public class OracleConnect {

	public static void main(String[] args) {
		//1.드라이버 클래스 로그
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.printf("드라이버 로드 성공\n");
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
		}
		
		try {
			DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.10.101:1521:xe",
					"c##user06", "user06");
			System.out.printf("데이터베이스 접속 성공\n");
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
		}
	}

		
}
