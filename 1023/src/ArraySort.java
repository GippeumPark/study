import java.util.Arrays;
import java.util.Comparator;

//Member 클래스의 데이터를 비교하는 클래스
//Comparator 인터페이스를 구현
class ComparatorImp1 implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		// 이름의 오름차순 비교
		return o1.getName().compareTo(o2.getName());
	}
	
}



public class ArraySort {

	public static void main(String[] args) {
		// Member 배열을 생성해서 5개의 인스턴스를 대입
		Member [] members = new Member[5];
		
		Member member = new Member();
		member.setNum(1);
		member.setName("남준");
		member.setAge(27);
		member.setScore(1994);
		
		members[0] = member;
		
		member = new Member();
		member.setNum(2);
		member.setName("석진");
		member.setAge(29);
		member.setScore(1992);

		members[1] = member;
		
		member = new Member();
		member.setNum(3);
		member.setName("윤기");
		member.setAge(28);
		member.setScore(1993);

		members[2] = member;
		
		member = new Member();
		member.setNum(3);
		member.setName("호석");
		member.setAge(27);
		member.setScore(1994);

		members[3] = member;
		
		member = new Member();
		member.setNum(4);
		member.setName("지민");
		member.setAge(26);
		member.setScore(1995);

		members[4] = member;

		
		//모든 데이터 출력
		for(Member n : members) {
			System.out.printf("%s\n", n);
		}

		//이름의 오름차순 정렬
		Arrays.sort(members, new ComparatorImp1());
		System.out.printf("이름의 오름차순정렬\n");


		//anonymous class를 이용한 이름의 내림차순 정렬
		System.out.printf("이름의 내림차순 정렬\n");
		Arrays.sort(members, new Comparator<Member>() {

			@Override
			public int compare(Member o1, Member o2) {
				// TODO Auto-generated method stub
				return o2.getName().compareTo(o1.getName());
			}
			
		});
		
		//모든 데이터 출력
		for(Member n : members) {
			System.out.printf("%s\n", n);
		}		

		
		
	}

}
