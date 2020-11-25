
import java.util.stream.Stream;

public class FilterMain {

	public static void main(String[] args) {
	
		Stream<String> st1 = 
			Singleton.sharedInstance().getStrList()
			.stream();
		//중복 제거
		//st1.distinct().forEach(System.out::println);
		
		//중복 제거하고 2개 건너뛰고 출력
		/*
		st1.distinct().skip(2).
			forEach(System.out::println);
		*/
		
		//filter는 매개변수가 1개이고 리턴 타입이 boolean인 함수를 대입
		st1.filter(it ->  it.indexOf("v") >= 0)
			.forEach(System.out::println);
		
		//Student 의 List를 스트림으로 생성
		Stream <Student> st2 = 
			Singleton.sharedInstance().
			getStudentList().stream();
		st2.filter(it ->  it.getGender().equals("여자"))
		.forEach(System.out::println);
		

	}
}
