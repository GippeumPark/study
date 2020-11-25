//1.프로듀서에 Product 변수를 먼저 불러온다
//2.사용할 객체를 setter를 통해 대입
//3.스레드를 이용해서 메소드 작성

public class Producer extends Thread {
	//공유자원 역할을 수행할 Product 변수를 선언
	private Product product;

	//Injection(주입) : 자신이 사용할 객체를 생성자나 setter를 통해서 외부로 부터 대입받는 것
	public Producer(Product product) {
		this.product = product;
	}

	//스레드로 동작할 메소드
	public void run() {
		//26번 put을 호출
		for(char ch='A'; ch<='Z'; ch= (char) (ch+1)) {
			System.out.printf("제품%c 를 생성\n", ch);
			product.put(ch);
		}
	}

}
