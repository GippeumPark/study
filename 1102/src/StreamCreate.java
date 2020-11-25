import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreate {

	public static void main(String[] args) {
		// 문자열 배열을 생성
		
		String [] names = {"효정","승희","미미","비니","지효","유아","아린"};
		List<String> list = new ArrayList<String>();
		list.add("클로저");
		list.add("큐피트");
		list.add("라이어");
		list.add("윈디데이");
		list.add("살짝설렜어");
		list.add("돌핀");
		
		//배열의 데이터를 stream을 이용해서 전부 출력
		//스트림 생성
		Stream<String> st1 = Arrays.stream(names);
		//데이터를 순회하면서 작업
		st1.forEach(System.out::println);
		
		//List를 이용해서 Stream을 생성
		Stream<String> st2 = list.stream();
		st2.forEach(System.out::println);
		
	}

}
