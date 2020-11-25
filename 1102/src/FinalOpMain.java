import java.util.List;

public class FinalOpMain {

	public static void main(String[] args) {
		// 공유데이터인 StudentList를 가져와서 저장하기

		List<Student> shareList = Singleton.sharedInstance().getStudentList();
		
		//점수의 합계
		System.out.printf("점수 합계:%d\n", shareList.stream().
				mapToInt(Student::getScore).sum());		

		
		//여자 점수의 합계
		System.out.printf("여자 점수 합계:%d\n", shareList.stream().
				filter(it -> it.getGender().equals("여자")).
				mapToInt(Student::getScore).sum());		
		
		
		//정수의 평균-Optional이라서 get 메소드를 이용해서 데이터 가져와야 함
		System.out.printf("점수 평균:%.2f\n", shareList.stream().
				mapToInt(Student::getScore).average().getAsDouble());
		
		
		//여자 가장 큰 데이터 가져오기
		System.out.printf("여자 점수 최대값:%s\n", shareList.stream()
				.filter(it -> it.getGender().equals("여자"))
				.max((n1, n2)-> n1.getName().compareTo(n2.getName()))
				.get());		
		
		
		
	}

}
