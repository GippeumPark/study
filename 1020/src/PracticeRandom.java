import java.util.Date;

public class PracticeRandom {

	public static void main(String[] args) {
		//static 메소드 와 그렇지 않은 메소드를 사용
		//java.lang.Math 클래스에 가면 random 이라는 메소드가 있는데 이 메소드는 0.0부터 1.0사이의 실수를 랜덤하게 리턴해주는 메소드		
		//이 메소드를 이ㅣ용하여 0.0에서 1.0 사이의 숫자를 3개 정도 출력해보기
		double su = Math.random();
		System.out.printf("su:%.2f\n", su);
		
		int sum = Integer.parseInt("109")+Integer.parseInt("19");
		System.out.printf("sum:%d\n", sum);
		
		Date date = new Date();
		System.out.printf("%s\n", date.toString());
		
		

	}

}
