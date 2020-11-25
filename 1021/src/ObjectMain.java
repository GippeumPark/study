
public class ObjectMain {

	public static void main(String[] args) {
		//Ppeum 클래스를 인스턴스를 생성하고 데이터를 설정
		//set 설정할때 사용
		Ppeum ppeum1 = new Ppeum();
		ppeum1.setNum (1);
		ppeum1.setName ("기쁨");
		
		//번호와 이름을 확인 - 출력
		//get 데이터 가져올 때 사용
		System.out.printf("번호 :%d 이름 :%s\n", ppeum1.getNum()	, ppeum1.getName());
		//toString은 호출하는 메소드에 인스턴스 이름만 대입하면 호출
		System.out.println(ppeum1);
		System.out.printf("%s\n", ppeum1.toString());
		
		//새로운 Ppeum 인스턴스 생성
		Ppeum ppeum2 = new Ppeum();
		ppeum2.setNum(1);
		ppeum2.setName("기쁨");
		
		//==로 인스턴스 비교
		//ppeum1과 ppeum2는 각각 new를 호출했으므로 false 리턴
		//equals는 내용이 같은지 비교하므로 true 리턴
		System.out.printf("==:%b\n", ppeum1==ppeum2);
		System.out.printf("equals:%b\n", ppeum1.equals(ppeum2));
		
		//새로운 인스턴스 생성
		Ppeum ppeum3 = new Ppeum();
		ppeum3.setNum(3);
		ppeum3.setName("꼬미");

		//ppeum3의 참조를 user4에 대입
		Ppeum ppeum4 = ppeum3;
		//ppeum4가 name을 변경
		ppeum4.setName("쁘미");
		//ppeum3과 ppeum4가 동일한 인스턴스를 참조하기 때문에
		//ppeum4가 name을 변경하면 ppeum3에게도 동일한 효과 적용
		System.out.printf("%s\n", ppeum3);
		System.out.printf("%s\n", ppeum4);
		
		//ppeum3의 내용을 복제해서 새로운 인스턴스를 ppeum5에 대입
		//사용 시 Ppeum클래스에 메소드를 입력해야 불러올 수 있으니 참고
		Ppeum ppeum5 = ppeum3.clone();
		//ppeum5의 내용을 변경해도 ppeum3의 내용은 변경되지 않음
		ppeum5.setName("꼬미");
		System.out.printf("%s\n", ppeum3);
		System.out.printf("%s\n", ppeum5);
		
	
	}

}
