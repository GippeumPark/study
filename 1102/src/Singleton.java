
import java.util.ArrayList;
import java.util.List;

//인스턴스를 1개만 생성할 수 있는 클래스의 디자인 패턴 - 싱글톤
//공유 자원을 소유한 클래스나 서버의 작업 처리 클래스가 싱글톤으로
//디자인 됩니다.
public class Singleton {
	//공유할 데이터
	private List<String> strList;
	private List<Student> studentList;
	
	private Singleton() {
		//공유 데이터 생성
		strList = new ArrayList<String>();
		strList.add("baseball");
		strList.add("soccer");
		strList.add("volleyball");
		strList.add("tennis");
		strList.add("pingpong");
		strList.add("baseball");
		
		studentList = new ArrayList<Student>();
		studentList.add(
			new Student(1, "유관순", "여자", 97));
		studentList.add(
			new Student(2, "김구", "남자", 89));
		studentList.add(
			new Student(3, "안중근", "남자", 95));
		studentList.add(
			new Student(4, "이봉창", "남자", 92));
		studentList.add(
			new Student(5, "윤봉길", "남자", 99));
		studentList.add(
			new Student(6, "남자현", "여자", 91));
		
	}
	
	private static Singleton obj;
	
	public static Singleton sharedInstance() {
		if(obj == null) {
			obj = new Singleton();
		}
		return obj;
	}

	public List<String> getStrList() {
		return strList;
	}

	public List<Student> getStudentList() {
		return studentList;
	}
	
	
	
}
