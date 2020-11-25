
public class StringBuilderTest {

	public static void main(String[] args) {
		// 비어있는 StringBuilder 클래스의 인스턴스를 생성
		
		StringBuilder sb = new StringBuilder();
		
		//문자열 추가
		sb.append("레드벨벳");
		sb.append("블랙핑크");
		
		//sb의 내용을 갖는 String 인스턴스를 생성
		String asd = sb.toString();
		//출력
		System.out.printf("%s\n",asd);

		
		//한 글자 씩 줄단위로 출력
		int len = asd.length();
		for(int i=0; i<len; i=i+1) {
			char ch = asd.charAt(i);
			System.out.printf("%c\n", ch);
		}
		
		
		String [] girlGroups = {"레드벨벳", "블랙핑크","원더걸스","소녀시대","잇지","오마이걸"};
		
		//위의 내용을 순서대로 줄 단위로 출력
		//인덱스를 활용하는 방법
		int lll = girlGroups.length;
		for(int i=0; i<111; i=i+1) {
			System.out.printf("걸그룹:%s\n", girlGroups[i]);
		}

		//빠른 열거를 이용하는 방법
		for(String sss1 : girlGroups) {
			System.out.printf("걸그룹:%s\n", sss1);
		}
	
	}

}
