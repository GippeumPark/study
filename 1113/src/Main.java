import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import fan.Fan;
import fan.FanDAO;
import todo.ToDo;
import todo.ToDoDAO;

public class Main {


	public static void main(String[] args) {
		// 키보드 입력을 받을 스캐너 객체를 생성
		Scanner sc = new Scanner(System.in); 
		
		//로그인 정보를 저장할 변수
		//처음엔 null을 저장해 놓음
		Fan logininfo=null;

		
		FanDAO dao = new FanDAO();
		mainloop: while(true) {
			//메뉴 입력받는 부분
			if(logininfo ==null) {
				System.out.printf("1.회원가입 2.로그인3.회원정보 수정4.탈퇴5.ToDo 작성 6.ToDo 목록 보기 7.ToDo 상세보기  10.종료\n");			
			}else {
				System.out.printf("1.회원가입 2.로그아웃3.회원정보 수정4.탈퇴 5.ToDo 작성 6.ToDo 목록 보기 7.ToDo 상세보기 10.종료\n");
			}
			System.out.printf("메뉴 입력:");
			String menu = sc.nextLine();
			
			Fan fan = null;
			
			//switch에서 break가 switch가 아닌 while을 빠져나가게 하고 싶으면
			//while앞과 빠져나갈 break뒤에 mainloop: mainloop; 넣기
			switch(menu.trim()) {
			case "1":
				//회원정보 저장할 객체 생성
				fan = new Fan();
				while(true) {
					//아이디 입력받음
					System.out.printf("아이디:");
					String id = sc.nextLine();
					//중복검사
					Fan f = dao.getFan(id);
					if(f == null) {
						fan.setId(id);
						System.out.printf("사용 가능한 아이디입니다.\n");
						break;
					}
					System.out.printf("이미 사용중인 아이디입니다\n");
				}
				System.out.printf("비밀번호:");
				fan.setPw(sc.nextLine());
				
				System.out.printf("이름:");
				fan.setName(sc.nextLine());
				
				Calendar cal = new GregorianCalendar();
				System.out.printf("로그인:");
				fan.setLogin(new Date(cal.getTimeInMillis()));
				System.out.printf("로그아웃:");
				fan.setLogout(new Date(cal.getTimeInMillis()));
				break;

			case "2":
				if(logininfo == null) {
					//아이디와 비밀번호 입력받아서 로그인 처리
					System.out.printf("아이디:");
					String id = sc.nextLine();
					System.out.printf("비밀번호:");
					String pw = sc.nextLine();
					logininfo = dao.login(id, pw);
					if(logininfo != null) {
						System.out.printf("로그인 성공\n");
					}else {
						System.out.printf("없는 아이디 이거나" + "잘못된 비밀번호 입니다.\n");
					}
					
				}else {
					logininfo = null;
					System.out.printf("로그아웃\n");
				}
				break;
			case"3":
				//로그인 여부 확인
				//로그인이 안되어 있으면 메뉴로 이동시킴
				//수정할 땐 로그인 먼저 해주기
				if(logininfo==null) {
					System.out.printf("로그인을 해야 합니다.\n");
					break; //case 문을 빠져나감 
				}
				
				//로그인 된 경우		
				//비밀번호 입력 받음
				System.out.printf("수정할 비밀번호:");
				String pw = sc.nextLine();
				
				//수정할 이름 입력 받음
				System.out.printf("수정할 이름:");
				String name = sc.nextLine();
				
				//정보 수정할 객체 생성
				Fan updateFan = new Fan();
				updateFan.setId(logininfo.getId());
				updateFan.setPw(pw);
				updateFan.setName(name);
				
				//업데이트 실행
				Boolean updateResult = dao.update(updateFan);
				if(updateResult == true) {
					System.out.printf("회원정보 수정성공\n");
				}else {
					System.out.printf("회원정보 수정실패\n");
				}
				
				break;  //브레이크가 나타날 때까지 돌아감, 돌아가야하는건지 확인 필요
			case"4":
				//로그인 여부 확인
				if(logininfo==null) {
					System.out.printf("회원 탈퇴를 하려면 로그인을 먼저 해야 합니다.\n");
					break; //case 문을 빠져나감 
				}
				//로그인 된 경우 삭제 실행
				Boolean r = dao.delete(logininfo.getId());
				if(r == true) {
					System.out.printf("탈퇴 성공\n");
				}else {	
					System.out.printf("탈퇴 실패\n");
				}	
				break;
			case"5":
				//로그인 여부 확인
				if(logininfo==null) {
					System.out.printf("로그인을 해야 작성할 수 있습니다.\n");
					break; //case 문을 빠져나감 
				}
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String content = sc.nextLine();
				//날짜 만들기, 년월일 입력받아 처리해야 함
				System.out.printf("년도 4자리 : ");
				String year = sc.nextLine();
				System.out.printf("월 2자리 : ");
				String month = sc.nextLine();
				System.out.printf("일 2자리 : ");
				String day = sc.nextLine();
				Calendar tododate = new GregorianCalendar(Integer.parseInt(year),
						Integer.parseInt(month)-1, //-1은 달이 한달 위로 나오기 때문에 -1해주는 것
						Integer.parseInt(day));
				//삽입할 데이터 생성
				ToDo todo = new ToDo();
				todo.setTitle(title);
				todo.setContent(content);
				todo.setTododate(new Date(tododate.getTimeInMillis()));
				//로그인 ID는 입력받는 것이 아니라 logininfo에서 찾아오는 것(이미 입력 되어있기 때문) 
				todo.setId(logininfo.getId());
				
				//데이터 삽입
				Boolean r1 = (new ToDoDAO()).insert(todo);
				if(r1 == true) {
					System.out.printf("작성 성공\n");
				}else {
					System.out.printf("작성 실패\n");
				}				
				break;
			case"6":
				//로그인 확인 없이 바로 리스트 불러옴
				List<ToDo> list = new ToDoDAO().todoList();
				for(ToDo todo1 : list) {
					System.out.printf("%s\n", todo1);
				}

				break;
			case"7":
				System.out.printf("조회할 번호:");
				//정수로 받을 수 없음
				String num = sc.nextLine();
				ToDo todo2 =
						new ToDoDAO().getToDo(
								Integer.parseInt(num));
				if(todo2 == null) {
					System.out.printf("없는 번호입니다.\n");
				}else {
					System.out.printf("%s\n", todo2);
				}
				break;
			case "10":
				//10번 누르면 mainloop를 종료
				System.out.printf("종료 합니다.\n");
				break mainloop;
			}
			
		}

		sc.close();
	}

}
