
public class BangTanMain {

	public static void main(String[] args) {
		//인스턴스 생성
		//프로그램 내에서 인스턴스를 1개만 만드는 경우 인스턴스 이름을 클래스 이름으로 하는데 첫글자를 소문자로 변경
		//User user = new User();
		//User()는 생성자를 호출하는 것
		BangTan bangtan = new BangTan();
		bangtan.setNum(1);
		bangtan.setId("hitmanbang");
		bangtan.setPw(20130613);
		bangtan.setNickname("꼬미쁘미");
		bangtan.setName("박기쁨");
		

		BangTan bangtan1 = new BangTan();
		this.getNum1(2);
		this.getId1("hitmanbang1");
		this.getPw1(20130706);
		this.getNickname1("bangtan3");
		bangtan.getName1("빅히트");
		
		BangTan bangtan1 = new BangTan(
				2, "hitmanbang1","20130706","bangtan3","빅히트");
		System.out.println(bangtan1);
		
		
		
		//생성자 오버로딩
		public BangTan(int num, String id, String pw, String nickname, String name) {
			//this가 붙지 않는 변수는 메소드 내에서부터 찾고 없으면 자신의 클래스에서 찾음
			this.name = name;
		
		}


		//속성의 값을 가져올 때는 get 메소드를 이용
		System.out.printf("%s\n", bangtan.getId());
		
		//전체를 확인 - toString을 호출해서 출력	}
		System.out.println(bangtan);
	}
}







