

interface MyInterface{
	public int n = 10; //인터페이스 안에 변수 선언하면 무조건 final
	
	public void method(); //인터페이스 안에 메소드 생성하면 무조건 abstract
	
	//인터페이스 안에 메소드를 생성하고 내용 작성하려면 접근 지정자를 default로 명시해야 함
	default void method1() {
		System.out.printf("디폴트 메소드\n");
	}
	
}

	//MyInterface 구현하는 클래스 (그냥 class생성시 abstrack메소드 구현하라고 오류가 뜸, 오류문구 마우스 갖다대면 add~~나옴 누르면 자동 작성됨)
class	MyInterfaceImp1	implements MyInterface{ // MyInterface옆 , 만 찍으면 다른 자료도 생성가능

	@Override
	public void method() {
		System.out.printf("인터페이스의 메소드 구현\n");
		
	}
	
}

public class Interface {

	public static void main(String[] args) {
		// interface는 new를 이용해 객체 생성 못함 , 구현해서 써야 함
		//MyInterface asd = new MyInterface();
		
		MyInterface asd = new MyInterfaceImp1();
		asd.method();
		
	}

}
