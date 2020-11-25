package todo;

import java.sql.Date;

public class ToDo {
	private int num;
	private String title;
	private String content;
	private Date tododate;
	private String id; //fan의 id
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getTododate() {
		return tododate;
	}
	public void setTododate(Date tododate) {
		this.tododate = tododate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "ToDo [num=" + num + ", title=" + title + ", content=" + content + ", tododate=" + tododate + ", id="
				+ id + "]";
	}
	
	
}
