import java.util.Calendar;

public class DateTime {

	public static void main(String[] args) {
		//현재 시간을 갖는 인스턴스 만들기
		Calendar cal = Calendar.getInstance();
		java.util.Date uDate = new java.util.Date();
		//날짜만 필요한 경우
		java.sql.Date sDate = new java.sql.Date(cal.getTimeInMillis());
		java.sql.Time sTime = new java.sql.Time(cal.getTimeInMillis());
		System.out.printf("%s\n", cal);
		System.out.printf("%s\n", uDate);
		System.out.printf("%s\n", sDate);
		System.out.printf("%s\n", sTime);
		

		
		//2017년3월 24일 오후 2시를 Calendar 인스턴스로 생성
		
		Calendar meetDay = Calendar.getInstance();
		meetDay.set(Calendar.YEAR, 2017);
		//월은 0부터 시작하므로 하나 적게 설정해야 함
		meetDay.set(Calendar.MONTH, 3);
		meetDay.set(Calendar.DAY_OF_MONTH, 4);
		meetDay.set(Calendar.HOUR, 23);
		
		//현재 시간을 인스턴스로 생성
		Calendar today = Calendar.getInstance();
		
		//2개의 날짜 사이의 갭을 계산 -1/1000초 단위
		long result = today.getTimeInMillis()-meetDay.getTimeInMillis();
		
		//일단위로 계산
		result = result / 1000 / 86400;
		System.out.printf("지나온 날 수 :%d\n", result);
		
	}

}
