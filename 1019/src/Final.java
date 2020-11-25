
//class 앞에 abstract가 있으면 상속받는 클래스를 생성해서 사용해야 함
//class 앞에 final이 있으면 상속할 수 없음
final class Test{
	//메소드 앞에 final을 추가하면 overriding 할 수 없음
	public void method() {
		System.out.printf("메소드\n");
	}
}
//상속받는 클래스
class TestEx extends Test{
	@Override
	public void method() {
		System.out.printf("기능추가\n");
	}
}
	

public class Final {

	public static void main(String[] args) {
		int n = 10;
		System.out.printf("n:%d\n", n);
		n = 20;
		System.out.printf("n:%d\n", n);
		
		final String NAME = "ADAM"; //final 변수이름 모두 대문자 권장
		System.out.printf("name:%s\n", NAME);
		//NAME = "GIPPEUM";
		//final 변수의 값은 변경할 수 없음
	
		//Test 클래스의 method를 호출
		Test test = new TestEx();
		test.method();
		
		
		
	}

}
