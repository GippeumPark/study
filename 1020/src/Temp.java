
public class Temp {

	
	//1-10까지를 1초씩 대기하면서 출력
	//Thread클래스의 sleep
	public static void main(String[] args) {
		for(int i=0; i<11; i=i+1) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.printf("%d\n",i);
		}


	}

}
