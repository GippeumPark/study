import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		// 
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
		member.setNum(4);
		member.setName("호석");
		member.setAge(27);
		member.setScore(1994);
		
		members[3] = member;
		
		member = new Member();
		member.setNum(5);
		member.setName("지민");
		member.setAge(26);
		member.setScore(1995);
		
		members[4] = member;

		
		//모든 데이터 출력
		for(Member n : members) {
			System.out.printf("%s\n", n);
		}			
		//데이터 정렬
		Arrays.sort(members);
		System.out.printf("정렬 후\n");
		
		//모든 데이터 출력
		for(Member n : members) {
			System.out.printf("%s\n", n);
			
		
		}
	}

}
