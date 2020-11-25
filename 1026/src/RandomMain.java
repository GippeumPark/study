import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		// 1-45 사이의 랜덤한 정수를 생성해서 출력
		
		//랜덤 인스턴스 생성
		Random r= new Random();

		//1-45는 45가지 모양
		//0-44 까지 리턴되므로 +1
		int result = r.nextInt(45) + 1;
		System.out.printf("result:%d\n", result);
	}

}
