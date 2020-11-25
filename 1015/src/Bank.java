
public class Bank {

	public static void main(String[] args) {

		// Bank 인스턴스 2개 생성
		ToDo todo1 = new ToDo();
		todo1.bankname = "kookmin";
		todo1.num = 123456;
		todo1.cnt = "12,360";
		
		ToDo todo2 = new ToDo();
		todo2.bankname = "hana";
		todo2.num = 789456;
		todo2.cnt = "3,584";
		

		ToDo.name = "박기쁨";
		System.out.printf("todo1의 예금주 이름은 : %d\n", todo1.name);
		System.out.printf("todo2의 예금주 이름은 : %d\n", todo2.name);		
	}

}
