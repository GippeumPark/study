
//자신의 스레드 이름을 1초마다 5번 출력하는 스레드 클래스를 생성	
class TheadTemp extends Thread{
	@Override
	public void run() {
		try {
			for(int i = 0; i<=5; i=i+1) {
				Thread.sleep(1000);
				System.out.printf("%s\n", getName());
			}
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}
	}
}


public class DaemonAndPriority {
	
	public static void main(String[] args) {
		TheadTemp temp = new TheadTemp();
		//스레드를 시작하기 전에 daemon으로 설정
		//다른 스레드가 수행 중이 아니면 자동 종료
		//Back-End Server 나 Download를 구현할 때 중요
		//Android에서는 이를 대체하는 Service라는 개념이 존재
		temp.setDaemon(true);
		temp.start();
		try {
			Thread.sleep(3000);
			System.out.printf("메인 스레드 종료\n");
		}catch(Exception e) {}

	}

}
