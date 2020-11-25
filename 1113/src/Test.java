import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.util.Calendar;
import java.util.GregorianCalendar;

import dao.DAO;
import fan.Fan;
import fan.FanDAO;
import todo.ToDo;
import todo.ToDoDAO;

public class Test {

	public static void main(String[] args) {
//		FanDAO dao = new FanDAO();
		
		//로그인 정보 입력
//		Fan fan = dao.login("ggomi", "1234");
//		System.out.printf("%s\n", fan);

		//아이디 삭제(id 삭제 시 정보 모두 삭제됨
//		dao.delete("ggomi");
		
		
		
//		FanDAO dao = new FanDAO();
//		
//		Fan fan = new Fan();
//		fan.setId("seokjin");
//		fan.setPw("1204");
//		fan.setName("김석진");
//		Calendar cal = new GregorianCalendar();
//		fan.setLogin(new Date(cal.getTimeInMillis()));
//		fan.setLogout(new Date(cal.getTimeInMillis()));
//
//
//		System.out.printf("%b\n", dao.register(fan));
		
		
		
//		FanDAO dao = new FanDAO();
//		System.out.printf("%s\n", dao.getFan("ggomi"));
		
		
//		DAO dao = new DAO();
//		dao.connect();
//		dao.close();
		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.printf("클래스 로드 성공\n");
//			//접속
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ppeum" + "?serverTimezone=UTC", "root", "1111");
//			System.out.printf("클래스 접속 성송\n");
//			
//			//종료
//			con.close();
//		} catch (Exception e) {
//			System.out.printf("%s\n", e.getMessage());
//		}

	}

}
