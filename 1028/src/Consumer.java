//1.Producer와 마찬가지로 Product 변수 불러오기
//2.run불러오기

public class Consumer extends Thread {
	private Product product;
	public Consumer(Product product) {
		this.product = product;
	}

	//스레드로 수행할 메소드
	//26번 수행할 자료를 get하기
	public void run() {
		for(int i=0; i<26; i=i+1) {
			char ch = product.get();
			System.out.printf("%c 를 소비\n", ch);
		}
	}
	
	
	
}
