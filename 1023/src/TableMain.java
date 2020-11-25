import java.util.ArrayList;
import java.util.Scanner;

public class TableMain {

	public static void main(String[] args) {
//		Table e1 = new Table();
//		System.out.printf("%s\n", e1);
//		Table e2 = new Table();
//		System.out.printf("%s\n", e2);
//
//		
//		


	ArrayList<Table> list = new ArrayList<Table>();
	
	//샘플 데이터 삽입
	Table table = new Table();
	table.setName("김남준");
	table.setPosition("랩라인");
	table.setOffice("일산");
	table.setAge(27);
	list.add(table);
	
	table = new Table();
	table.setName("김석진");
	table.setPosition("보컬라인");
	table.setOffice("과천");
	table.setAge(29);
	list.add(table);
	
	table = new Table();
	table.setName("민윤기");
	table.setPosition("랩라인");
	table.setOffice("대구");
	table.setAge(28);
	list.add(table);
	
	table = new Table();
	table.setName("정호석");
	table.setPosition("랩라인");
	table.setOffice("광주");
	table.setAge(27);
	list.add(table);
	
	table = new Table();
	table.setName("박지민");
	table.setPosition("보컬라인");
	table.setOffice("부산");
	table.setAge(26);
	list.add(table);
	
	table = new Table();
	table.setName("김태형");
	table.setPosition("보컬라인");
	table.setOffice("거창");
	table.setAge(26);
	list.add(table);
	
	table = new Table();
	table.setName("전정국");
	table.setPosition("보컬라인");
	table.setOffice("부산");
	table.setAge(24);
	list.add(table);
	
	//키보다 입력을 받기 위해서 생성
	Scanner sc = new Scanner(System.in);
	
	//무한반복
	while(true) {
//문제가 정수로만 입력하다 문자 입력시 오류발생하는 경우 try로 예외문 생성하면 해결됨
		try {
		//전체보기, 개수를 지정해서 보기, 이름으로 정렬해서 보기, 이름으로 검색해서 보기
		//종료
		System.out.printf("1.전체보기, 2.개수지정, 3.이름으로 정렬, 4.이름으로 검색\n");
		System.out.printf("메뉴 선택 :");
		int menu = sc.nextInt();

		//menu가 1번부터 5번사이인지 확인
		//아닐 때는 다시 입력 받도록 작성
		if(menu <1 || menu >5) {
			System.out.printf("1부터 5사이로 입력해야 합니다\n");
			//맨 위로 이동
			continue;
		}
		
		//메뉴부터 만들어 실행 해보고 내용 입력하고 실행해보기
		
		switch(menu) {
		case 1: 
			for(Table asd : list) {
				System.out.printf("%s\n", asd);
			}
//			System.out.printf("전체보기\n");
			break;
		case 2:for(Table zxc : list) {
			System.out.printf("%s\n", zxc);
		}
//			System.out.printf("개수지정\n");
			break;
		case 3:System.out.printf("이름으로 정렬\n");
			break;
		case 4:System.out.printf("이름으로 검색\n");
			break;
		case 5: //System.out.printf("종료\n");           //프로그램 종료 시 exit클래스 작성
			System.out.printf("프로그램을 종료합니다.\n");
			sc.close();
			System.exit(0);
			break;
		default:System.out.printf("잘못된 메뉴\n");
			break;	
				
		
		}
		
		
		}catch(Exception e) {
			sc.nextLine();
			System.out.printf("메뉴는 정수로 입력 해주세요\n", e);
			
		}
	}
	
	
	
	}	
	
}
