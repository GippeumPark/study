import java.util.regex.Pattern;

public class StringRegExp {

	public static void main(String[] args) {
		// 
		//String 한글 = "^아";
		Pattern p = Pattern.compile("^\\d{3}-\\d{3,4}-\\d{4}$");
		//검사할 문자열 배열 생성
		String [] phone = {
				"010-8857-1916","ppeum","기쁨","인천 야구","방탄소년단",
				"BTS","Wyverns","Incheon"
		};
		//한글 존재 여부 확인
		for(String imsi : phone) {
			System.out.printf("%b\n", p.matcher(imsi).find());
		}
		
	}

}
