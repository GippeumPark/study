//모든 자료 모아서 실행 시 main으로 start해서 실행시키기

public class ThreadMain {

	public static void main(String[] args) {
		// 공유 자원 생성
		Product product = new Product();
		//생산자 스레드를 생성해서 실행
		Producer producer = new Producer(product);
		producer.start();
		//소비자 스레드를 생성해서 실행
		Consumer consumer = new Consumer(product);
		consumer.start();
		//소비자는 독립적이기 때문에 실행이 안돼도 다른것들은 실행됨
	
	}

}
