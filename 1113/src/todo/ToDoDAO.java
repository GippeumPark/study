package todo;

import java.util.ArrayList;
import java.util.List;

import dao.DAO;

//DAO 클래스를 상속받은 ToDoDAO 클래스 생성 시 Superclass-Bowser에 DAO 선택하고 하든지
//직접 입력하든지 해서 extends DAO 불러오기
public class ToDoDAO extends DAO {
	
	//데이터 삽입을 위한 메소드 생성
	public Boolean insert(ToDo todo) {
		Boolean result = false;
		connect();
		try {
			//sql 생성
			//num은 자동입력이기 때문에 작성할 필요 없음
			pstmt = con.prepareStatement("insert into todo(" + "title, content, tododate, id) " + "values(?, ?, ?, ?)");
			//?값을 바인딩
			pstmt.setString(1, todo.getTitle());
			pstmt.setString(2, todo.getContent());
			pstmt.setDate(3, todo.getTododate());
			pstmt.setString(4, todo.getId());
			
			int r = pstmt.executeUpdate(); //항상 정수를 리턴하기 때문에executeUpdate 정수 리턴
			//삽입을 했다는 건 반드시 0보다 값이 커야 함
			//그렇게 했을때 트루값을 리턴
			if(r > 0) {
				result = true;
			}
		
		
		
		} catch (Exception e) {
			System.out.printf("ToDo 작성 실패:%s\n", e.getMessage());
			e.printStackTrace();
		}
		
		
		close();
		return result;
		
	}

	//글을 전부 가져오는 메소드
	//select * from todo ;
	public List<ToDo> todoList(){
		//여러 개의 데이터를 리턴할 때는 인스턴스를 먼저 만들어서 리턴
		List<ToDo> list = new ArrayList<ToDo>();
		//데이터베이스 접속
		connect();
		try {
			//SQL 생성
			pstmt = con.prepareStatement(
					"select * from todo");
			//?가 없을 경우 바로 실행
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ToDo todo = new ToDo();
				todo.setTitle(rs.getString("title"));
				todo.setContent(rs.getString("content"));
				todo.setId(rs.getString("id"));
				todo.setTododate(rs.getDate("tododate"));
				list.add(todo);
				
			}
			
		} catch (Exception e) {
			System.out.printf("ToDo 목록 가져오기 실패:%s\n", e.getMessage());
			e.printStackTrace();
		}
			
		
		close();
		return list;
		
	}
	
	//상세보기를 위한 메소드
	//기본 값은 정수
	public ToDo getToDo(int num) {
		//데이터 하나 찾을 땐 null을 주고 todo를 리턴
		ToDo todo = null;
		connect();
		try {
			//기본키를 가지고 1개 데이터를 찾아오는 SQL
			pstmt = con.prepareStatement(
					"select * from todo " + "where num = ?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				todo = new ToDo();
				todo.setNum(rs.getInt("num"));
				todo.setTitle(rs.getString("title"));
				todo.setContent(rs.getString("content"));
				todo.setTododate(rs.getDate("tododate"));
				todo.setId(rs.getString("id"));
			}
			
		} catch (Exception e) {
			System.out.printf("ToDo 상세보기 실패:%s\n", e.getMessage());
			e.printStackTrace();
		}
			
		close();
		return todo;
		
	}
	
	
}
