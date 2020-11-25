

//3개 클래스의 인스턴스를 하나의 변수에 저장할 수 있도록 하기 위해서 만든 클래스
class Starcraft{
	//Starcraft 클래스 타입의 변수가 attack을 호출할 수 있도록 하기 위해서 생성한 메소드
	public void attack() {}
}

class Protoss extends Starcraft{
	@Override
		public void attack() {
			System.out.printf("프로토스의 공격\n");
		}
}



class Zerg extends Starcraft{
	public void attack() {
		System.out.printf("저그의 공격\n");
	}
}



class Terran extends Starcraft{
	public void attack() {
		System.out.printf("테란의 공격\n");
	}
}




public class Polymorphism {

	public static void main(String[] args) {
		// 3개의 클래스에 존재하는 인스턴스 메소드 호출
		// 3개 클래스 모두 Starcraft를 상속받았기 때문에 Starcraft 타입의 변수에 인스턴스를 대입할 수 있음
		Starcraft star = new Protoss();
		star.attack();
		
		star = new Zerg();
		star.attack();
		
		star = new Terran();
		star.attack();
		
		

	}

}
