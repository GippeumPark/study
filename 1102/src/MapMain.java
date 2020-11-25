
import java.util.Comparator;
import java.util.stream.Stream;

public class MapMain {

	public static void main(String[] args) {
		//studentList의 Stream을 생성
		Stream <Student> studentStream = 
				Singleton.sharedInstance().
				getStudentList().stream();
		//Student를 점수만 변환
		/*
		studentStream.mapToInt(Student::getScore)
		.forEach(System.out::println);
		*/
		
		studentStream.sorted(
				(n1, n2)->{
					return n1.getName().compareTo(
							n2.getName());})
		.forEach(it->System.out.printf("%s\n", it));
	
	}
}
