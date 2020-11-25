
public class String1 {

	public static void main(java.lang.String[] args) {
		// String 클래스의 인스턴스 생성
		String ios = "GGomi";
		
		//2번쨰 문자 출력
		char ch = ios.charAt(2);
		System.out.printf("%c\n", ch);
		
		//문자의 길이 출력
		int len = ios.length();
		System.out.printf("문자의길이:%d\n", len);		
		
		//문자 1개씩 출력
		for(int i=0; i<len; i=i+1);
			char asd = ios.charAt(1);
			System.out.printf("문자1개씩출력:%c\n", asd);
		
		String rv1 = "ppeum12@gmail.com";
		String rv2 = "ppeum12@naver.com";
		//rv1과 rv2에 gmail이 포함되어 있는지 판별
		//대소문자는 구별하지 않음
	
			if(rv1.toLowerCase().indexOf(
					"gmail".toLowerCase()) >= 0) {
				System.out.printf("rv1 에 gmail이 있습니다.\n");
			}else {
				System.out.printf("rv1 에 gmail이 없습니다.\n");
			}
			if(rv2.toLowerCase().indexOf(
					"gmail".toLowerCase()) >= 0) {
				System.out.printf("rv2 에 gmail이 있습니다.\n");
			}else {
				System.out.printf("rv2 에 gmail이 없습니다.\n");
			}

		
	}

}
