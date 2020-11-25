


//String msg 라는 변수와 disp 라는 메소드를 소유한 Base 클래스
	class Base{
		public String msg; //"상위 클래스의 msg";
		public Base(String msg) {
			this.msg = msg;
		}

		public void disp(){
			System.out.printf("상위 클래스의 메소드\n");
		}
		
	}

	
//Base 클래스를 상속받은 Derive 클래스
	class Derive extends Base{
		public String mas = "하위 클래스의 mag"; 
			
		
		public Derive() {
			super("매개변수");
		}
	
		public void print() {
			System.out.printf("하위 클래스의 mag : %s\n" , msg);
			System.out.printf("상위 클래스의 mag : %s\n", super.msg);
		}		


	
		@Override
		//상위 클래스에서 disp()라는 메소드가 있는데 하위 클래스에서 다시 만드는 것을 Overriding
		public void disp() {
			System.out.printf("하위 클래스의 메소드\n");
		}
	}



public class InheritanceMain {	
	public static void main(String[] args) {
		// Derive 클래스의 객체를 생성
		Derive derive = new Derive();
		//Derive 클래스에는 disp가 없지만 Base 클래스에는 disp가 있고
		//Derive는 Base를 상속받았으므로 disp 사용 가능
	
		derive.disp();
		
		derive.print();
		
		//상위 클래스 타입의 참조형 변수에는 하위 클래스 타입의 인스턴스를 대입할 수 있음
		Base base = derive;
		
		//하위 클래스 타입의 변수에 상위 클래스 타입의 인스턴스는 대입할 수 없음
		//강제 형 변환을 이용해야 만 함
		//derive = base; //이 구문은 에러
		
		derive = (Derive)base;
		
		//이 구문은 문법적인 에러는 없지만 실행하면 예외가 발생함
		//위의 base에는 Dreive 가 들어있는데 Base가 들어있음
		//위의 경우처럼 원래는 하위 클래스 타입이었는데 상위에 저장하다가 되돌리는 것은 가능하지만
		//원래 상위 타입인 경우는 실행 도중 예외가 발생
		//ClassCastException
	//	derive = (Derive)(new Base(""));
		
		
		//다형성
		Base b= new Base(""); //상위 클래스의 인스턴스를 대입
		b.disp(); //상위 클래스의 메소드가 호출
		
		b = new Derive(); //하위 클래스의 인스턴스를 대입
		b.disp(); //하위 클래스의 메소드가 호출
		
		
	}
}
