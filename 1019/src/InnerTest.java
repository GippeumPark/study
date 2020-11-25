

class Outer{
	//일반 내부 클래스 생성
	class Inner{
		
	}
	//내부에서 Inner 클래스 사용
	Inner inner = new Inner();

	//Inner Class에 static 멤버가 있을 때는 class앞에 static을 추가해 줘야 함
	static class StaticInner{
		static int member = 10;
	}
	
	//LocalInner : 메소드 안에서 만들어진 클래스
	//메소드 안에서만 사용 가능
	public void method() {
		class LocalInner{
			
		}
		LocalInner LocalInner = new LocalInner();
	}
	//LocalInner 는 메소드 외부에서 사용 못함	
	//LocalInner localinner = new LocalInner();  에러남
	
}


public class InnerTest {

	public static void main(String[] args) {
		// 일반 Inner 클래스는 외부에서는 외부 클래스의 인스턴스를 생성해서 사용
		//Inner inner = new Inner(); //에러
		InnerTest outer = new InnerTest();
		Outer.Inner inner = Outer.new Inner();
		
		//static inner 클래스는 외부 클래스의 인스턴스 없이 사용
		System.out.printf("%d\n", Outer.StaticInner.member);
		

	}

}
