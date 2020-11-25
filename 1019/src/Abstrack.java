

//인스턴스를 생성할 수없는 추상 클래스로 생성
abstract class Starcraft1{
	//내용이 없는 추상 메소드
	//하위 클래스에서 반드시 내용을 만들어 줘야 함
	abstract public void attack();
}

class Protoss1 extends Starcraft1{
	@Override
		public void attack() {
			System.out.printf("프로토스의 공격\n");
		}
}



class Zerg1 extends Starcraft1{
	public void attack() {
		System.out.printf("저그의 공격\n");
	}
}



class Terran1 extends Starcraft1{
	public void attack() {
		System.out.printf("테란의 공격\n");
	}
}




public class Abstrack {

	public static void main(String[] args) {
		// 3개의 클래스에 존재하는 인스턴스 메소드 호출
		// 3개 클래스 모두 Starcraft를 상속받았기 때문에 Starcraft 타입의 변수에 인스턴스를 대입할 수 있음
		Starcraft1 star = new Protoss1();
		star.attack();
		
		star = new Zerg1();
		star.attack();
		
		star = new Terran1();
		star.attack();

		//추상 클래스는 new를 이용해서 인스턴스 생성할 수 없음
		star = new Starcraft1();
		star.attack();
		
		

	}

}


