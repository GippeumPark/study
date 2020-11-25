
public class BangTan {

	private int num;
	private String id;
	private int pw;
	private String nickname;
	private String name;
	
	
	//매개변수가 없는 생성자
	public BangTan() {
		System.out.printf("매개변수가 없는 생성자\n");
	}
	
	private int num1;
	private String id1;
	private int pw1;
	private String nickname1;
	private String name1;


	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	//출력하는 메소드에서 인스턴스 이름을 대입하면 자동으로 호출되는 클래스
	//인스턴스 내부의 값을 빠르게 확인할 목적으로 생성
	public String toString() {
		return "BangTan [num=" + num + ", id=" + id + ", pw=" + pw + ", nickname=" + nickname + ", name=" + name + "]";
	}


		
	
	
	
	
}
