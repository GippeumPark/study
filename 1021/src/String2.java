
public class String2 {

	public static void main(String[] args) {
		String requestUri = "web/update/123";
		//마지막 / 다음에 123을 추출해서 정수로 변환해서 출력
		//String의 메소드와 문자열을 숫자로 변환하는 메소드를 이용
//		int i = Integer.parseInt("123");
//		System.out.printf("문자에서 정수로%5d\n", i);

		//split 이용 - "/"로 분할
		String []ar = requestUri.split("/");
		int num = Integer.parseInt(ar[ar.length-1]); //
		System.out.printf("num:%d\n", num);

		//substring 이용
		//마지막 /의 위치 찾기
		int idx = requestUri.lastIndexOf("/");
		String articleNum = 
				requestUri.substring(idx + 1);
		System.out.printf("num:%s\n", articleNum);
		
		
	
		String password = "Dokki1000DKi!";
		//password에서 대문자의 개수 세기
		//글자 단위로 가져와서 'A'보다 크거나 같고 'Z'보다 작거나 같은 데이터의 개수를 세면 됨
		int cnt = 0;
		for(int i=0; i<password.length(); i=i+1) {
			char asd=password.charAt(i);
			if(asd >='A' && asd <= 'Z') {
				cnt=cnt+1;
			}
		}
		System.out.printf("대문자의 개수:%d\n", cnt);
		
		
			

		
		//password에서 대문자도 아니고 소문자도 아니고 숫자도 아닌 데이터의 개수를 세기
		int cnt1 = 0;
		for(int i=0; i<password.length(); i=i+1) {
			char ssd=password.charAt(i);
			if(!(ssd>='A' && ssd <='Z' || ssd>='a' && ssd <='z' || ssd>='0' && ssd <='9')) {
				cnt1=cnt1+1;
			}
		} System.out.printf("특수문자 개수:%d\n", cnt1);
		
		
		
	}

}
