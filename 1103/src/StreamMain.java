import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "기쁨", "여자", 21));
		list.add(new Student(2, "유리", "남자", 16));
		list.add(new Student(3, "장미", "여자", 17));
		list.add(new Student(4, "수진", "남자", 19));
		list.add(new Student(5, "현아", "여자", 25));
		list.add(new Student(6, "한별", "남자", 22));

		//성별 분류
		System.out.printf("%s\n", list.parallelStream().
				collect(Collectors.groupingBy(Student::getGender)));
		
		//성별로 score의 평균
		System.out.printf("%s\n", list.stream().collect(Collectors.groupingBy(Student::getGender,
				Collectors.averagingDouble(Student::getScore))));
		
		
	}

}
