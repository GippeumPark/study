
public class Student {

	public static void main(String[] args) {
		// Student 클래스 인스턴트 2개 생성
		Friend friend1 = new Friend();
		Friend friend2 = new Friend();
		
		//friend1과 friend2의 데이터 설정
		friend1.num = 1;
		friend1.name = "Jangmi";
		friend1.phone = 2786;
		
		friend2.num = 2;
		friend2.name = "Uri";
		friend2.phone = 1220;
		
		//static이 붙은 변수는 클래스 이름으로도 접근 가능
		//공유하기 때문에 누군가가 변경하면 다른 인스턴스의 것도 변경된 것처럼 보임
		Friend.school = "문문";
		System.out.printf("friend1의 학교 :%s\n", friend1.school);
		System.out.printf("friend2의 학교 :%s\n", friend2.school);
		

	}

}
