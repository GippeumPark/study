
public class StringFormat {

	public static void main(String[] args) {
		int x = 100;
		int z = 200;
		//x:100 탭 y:200 형태로 출력하기
		//String.format은 문자열을 만들어 주는 것이고 printf는 화면에 출력해 줌
		//java 및 c언어, 모바일 출력 시 많이 쓰이게 되므로 출력할 때 이 방법으로 쓰는 것 연습, \n는 모바일 출력에서 많이 사용되지 않음
		String display = String.format("x:%d\tz:%d\n", x,z);
		System.out.printf(display);

		System.out.printf("x:%d\t" + "z:%d\n", x, z);

		
	}

}
