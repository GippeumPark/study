import java.io.Serializable;

public class User implements Serializable {
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
		return "DTO [num=" + num + ", name=" + name + ", score=" + score + "]";
	}

}
