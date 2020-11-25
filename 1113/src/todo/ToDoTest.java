package todo;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ToDoTest {

	public static void main(String[] args) {
		ToDoDAO dao = new ToDoDAO();
		System.out.printf("%s\n", dao.getToDo(1));
		System.out.printf("%s\n", dao.getToDo(4));
		
		
//		System.out.printf("%s\n", dao.todoList());
		
//		

		//내용 삽입시 테스트
//		ToDoDAO dao = new ToDoDAO();
//		
//		ToDo todo = new ToDo();
//		todo.setTitle("종로");
//		todo.setContent("멤버들 약속");
//		Calendar cal = new GregorianCalendar(2020, 10, 17); //한달 뒤의 데이터로 입력됨 11/17
//		todo.setTododate(new Date(cal.getTimeInMillis()));
//		todo.setId("ggomi");
//		
//		dao.insert(todo);

//		ToDoDAO dao = new ToDoDAO();
		
//		ToDo todo = new ToDo();
//		todo.setTitle("인천");
//		todo.setContent("을왕리 약속");
//		Calendar cal = new GregorianCalendar(2020, 12, 17); //한달 뒤의 데이터로 입력됨 11/17
//		todo.setTododate(new Date(cal.getTimeInMillis()));
//		todo.setId("ggomi");
//		
//		dao.insert(todo);		
		
//		ToDo todo = new ToDo();
//		todo.setTitle("서울");
//		todo.setContent("크리스마스 약속");
//		Calendar cal = new GregorianCalendar(2020, 12, 12); //한달 뒤의 데이터로 입력됨 11/17
//		todo.setTododate(new Date(cal.getTimeInMillis()));
//		todo.setId("ggomi");
//		
//		dao.insert(todo);			
		
		
		
		
		
		
				

	}

}
