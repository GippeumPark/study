import java.util.regex.Pattern;

public class EmailReg {

	public static void main(String[] args) {
		
		String [] emails = {"ppeum12@naver.com", "ppeum12@gmail.com", "ppeum12@hanmail.net"};
		//위의 데이터의 이메일이 맞는지 체크하기

		//1.Java에서 정규직을 사용할 수 있는 클래스를 갖고 확인하는 방법을 검색
		//2.email 정규식을 검색
		//java스크립트 형태로 검색되면 맨 앞의 / 와만 뒤의 /는 제거		
		
		
		Pattern p = Pattern.compile("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$");
		for(String email : emails) {
			System.out.printf("%b\n", p.matcher(email).find());
		}
		
	
	}

}
