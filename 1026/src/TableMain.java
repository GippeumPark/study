import java.util.ArrayList;
import java.util.Comparator;
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

	//정렬 기준을 설정할 변수
	boolean flag = false;
	
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
				
		
		//메뉴부터 만들어 실행 해보고 내용 입력하고 실행해보기(다 입력 후 실행했다 오류발생시 찾기 힘듦)
		
		switch(menu) {
		case 1: 
			for(Table asd : list) {
				System.out.printf("%s\n", asd);
			}
//			System.out.printf("전체보기\n");
			break;
		case 2:
			//System 출력할 개수 입력문자 작성 후 입력받기 진행
			//다른값이 나올 것 같으면 while작성하기
			while(true) {
				try {
					//출력할 개수 입력받기
					System.out.printf("출력할 개수를 입력하세요:\n");					
					int cnt = sc.nextInt();

					//데이터 개수 확인
					//1보다 작거나 데이터 개수보다 크면 데이터 개수로 설정
					if(cnt<1||cnt>list.size()) {
						System.out.printf("음수나 데이터 개수보다"+
								"큰 수를 입력하면 데이터 개수로 설정합니다.\n");
						cnt=list.size();
					}

					//cnt만큼 데이터를 가져와서 출력
					//데이터를 가져올 때는 get사용
					//전체열거일 경우 빠른열거를 사용할 수 있지만 일부 가져올 경우 for문형으로 지정해서 출력
					
					for(int i=0; i<cnt; i=i+1) {
						//출력할 떄 인스턴스를 바로 출력하는 경우는toString이라는 메소드가 호출되서
						//그 결과를 출력하는 것. toString이 재정의 되어 있지 않으면 클래스 이름과 해시코드가
						//문자열로 리턴. 프로그래밍 언어마다 이 메소드의 이름은 다르므로 프로그래밍 언어를 공부할 때
						//이러한 메소드의 이름을 알아둘 필요가 있음
						System.out.printf("%s\n", list.get(i));
					}
					break;
					}catch(Exception e) {
						System.out.printf("데이터 개수는 숫자로 입력하세요\n");
					//숫자 입력 뒤의 문자열을 제거하기 위해서
					sc.nextLine();
					continue;
				}

			}			

		case 3:			
			if(flag == false) {
				list.sort(new Comparator<Table>() {

					@Override
					public int compare(Table o1, Table o2) {

						return o1.getName().compareTo(o2.getName());
					}					
				});
			}else {
				list.sort(new Comparator<Table>() {

					@Override
					public int compare(Table o1, Table o2) {
						// 숫자 정렬 시
//						return o1.getAge() - o2.getAge();
						return o1.getName().compareTo(o1.getName());
					}
					
				});
			}

			
			//전체 데이터 출력
			for(Table e : list) {
				System.out.printf("%s\n", e);				
			}
			//flag 값을 변경
			flag = !flag;
			break;
		case 4:
			//검색할 이름을 입력받기
			sc.nextLine();
			System.out.printf("검색할 이름을 입력하세요.\n");
			String name = sc.nextLine();
			
			//검색된 결과를 저장할 list생성
			ArrayList<Table> searchList = new ArrayList<Table>();
			for(Table e : list) {
				//일치하는 것은 equals로 비교해서 동일한 데이터를 찾으면 searchList에 추가
				//비밀번호같은 정확해야 하는 것은 equals로 비교, 리스트검색같은경우는 indexOf로 많이 사용
		/*
				if(e.getName().equals(name)) {
					searchList.add(e);
		*/
			//name이 포함되어 있으면 조회
				if(e.getName().indexOf(name)>=0) {
					searchList.add(e);
				
				
				}
			}
			
			
			
			
			//검색된 데이터가 없는 경우와 있는 경우로 나누어서 출력
			if(searchList.size()==0) {
				System.out.printf("검색된 데이터가 없습니다.\n");
			}else {
			//검색 결과 출력
				for(Table e : searchList) {
					System.out.printf("%s\n", e);
				}
			}	
			
			
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
