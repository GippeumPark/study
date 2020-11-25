
public class Student {
	private int num;
	private String name;
	private String gender;
	private int score;
	
	public Student() {
		super();
	}
	public Student(int num, String name, String gender, int score) {
		super();
		this.num = num;
		this.name = name;
		this.gender = gender;
		this.score = score;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", gender=" + gender + ", score=" + score + "]";
	}
}
