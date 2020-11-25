import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class StandardLambdaAPI {

	public static void main(String[] args) {
		// Consumer - 매개변수가 1개이고 리턴 타입이 없는 accept 소유
		
		//문자열 데이터를 이용하는 Consumer를 생성
		Consumer<String> consumer =
//			(매개변수자료형(생략가능) 매개변수이름 ..args.clone().) -> {내용};
//			(),{ } 생략 가능
				str -> System.out.printf("%s\n", str);
			consumer.accept("람다 연습");
			
			
			
		Supplier<Integer> supplier =
//				매개변수가 없기 때문에 괄호 생략 불가
				() -> {
					//랜덤한 1~45사이의 숫자 리턴
					Random r = new Random();
					int su = r.nextInt(45) + 1;
					return su;
					
				};
				int value = supplier.get();
				System.out.printf("su:%d\n", value);
			
			
	}

}
