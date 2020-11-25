
public class PracticeMain {

	public static void main(String[] args) {
		//Practice 인스턴스 2개 만들기
		//static{}은 1개만 호출되어야 하고 {}는 2번 호출되어야 합니다.
		
		Practice p1 = new Practice();
		Practice p2 = new Practice();
	
		
		
		//Hello Java를 3번 출력
		p1.method();
		
		//Hello Kotlin을 출력
		System.out.printf("Hello Kotlin\n");
				
		//Hello Java를 3번 출력
		p1.method();
		
		
		p1.print(7); //7번 출력
		p1.print(4); //4번 출력
		
		
		//Practice 클래스에 있는 add 함수를 호출(실행)
		//public void add(int a, int b)
		//인스턴스를 생성
		Practice practice = new Practice();
		//정수 매개변수 2개를 요구하므로 2개를 대입해서 호출
		practice.add(30, 30);
		//위의 경우는 return 되는 데이터가 없기 때문에 이 결과를 가지고
		//다른 작업을 수행할 수 없음
		
		
		//public int addReturn(int a, int b)
		int r = practice.addReturn(30, 20);
		System.out.printf("결과:%d\n", r);
		
		//return받은 결과가 있어 이 결과를 가지고 다음 작업에 이용이 가능
		r = practice.addReturn(r, 50);
		System.out.printf("결과:%d\n", r);
		
		//Practice 클래스의 static 메소드 호출
		Practice.asd();
		
		//Math 클래스에는 0.0~1.0사이의 랜덤한 숫자를 생성해주는 메소드가 존재
		//static double random()
		//0.0~1.0 사이의 랜덤한 숫자를 1개 출력
		double random = Math.random();
		System.out.printf("%f\n", random); //%f 실수 한개 매칭
	
		//Math 클래스에는 샐수를 소수 첫째 자리에서 반올림해주는 아래와 같은 함수가 존재합니다
		//이 함수를 이용해서 6.78을 소수 첫째 자리에서 반올림해서 출력하기
		//static long round(double a)
		long round = Math.round(6.78); //수학적 공식으로 round = Math.round(수입력)부터 하고 실행할 값을 확인하고 입력 long 
		System.out.printf("%d\n", round);
	
		practice.thisCheck(100);

		
		
		
		
		
		
	}

}
