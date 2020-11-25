import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ToDay {

	public static void main(String[] args) {
		// 날짜 추출하기
		java.util.Date date = new java.util.Date();
		
		//2020-10-29 형태의 문자열 만들기 (java.util)
		SimpleDateFormat asd = new SimpleDateFormat("yyyy-MM-dd");
		String today = asd.format(date);
		System.out.printf("%s\n", today);
		
		
		//2020-10-29 형태의 문자열 만들기 (java.sql)
		java.sql.Date t = new java.sql.Date(System.currentTimeMillis());
		System.out.printf("%s\n", t);
		

	}

}
