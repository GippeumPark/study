
public class MySQLDriverLoad {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.printf("MySQL 드라이버 로드 성공\n");
			
		} catch (Exception e) {
			System.out.printf("드라이버 로드 실패%s\n", e.getMessage());
			e.printStackTrace();
		}
	}

}
