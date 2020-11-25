
public class TemplateMain {

	public static void main(String[] args) {

		// 1.template 클래스의 disp는 고정된 문자열을 출력해주는 메소드
		//원형은 static void disp()
		//이 메소드를 호출해보세요
		TempLate.disp();
		
		
		
		//2.Template 클래스의 oneArg는 문자열을 입력받아서 출력해주는 메소드
		//원형은 static void OneArg(String)
		//이 메소드를 호출해서 원하는 메시지를 출력해 보세요
		TempLate.oneArg("test");

		
		
		
		//3.Template 클래스의 memberDisp는 정수를 입력받아서 출력하는 메소드
		//원형은 void memberDisp(int)
		//원하는 숫자를 입력해서 숫자를 출력해보세요
		TempLate memberDisp = new TempLate();
		memberDisp.memberDisp(7);

		
		
		
		//Template 클래스의 returnMemberFunc은 정수의 제곱을 구해주는 메소드
		//원형은 int returnMemberFunc(int)
		//원하는 숫자를 입력해서 제곱값을 구하고 출력해보세요
		
//		int result = 
//				template.returnMemberFunc(10);
//		System.out.printf("result:%dn", result);
	
		
		
		

		
	}

}
