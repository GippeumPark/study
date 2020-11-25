
public class Singer {
	public Singer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Singer(int num, String name, int score) {
		super();
		this.num = num;
		this.name = name;
		this.score = score;
	}
	private int num;
	private String name;
	private int score;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Singer [num=" + num + ", name=" + name + ", score=" + score + "]";
	}
	
	
	
	
	
}
