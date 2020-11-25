
public class Member {

	private int num;
	private String name;
	private int age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScor() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	//오름차순
//	@Override
//	public int compareTo(Member ai) {
//		if(this.score > ai.score) {
//			return 1;
//		}else if(this.score == ai.score) {
//			return 0;
//		}else {
//			return -1;
//		}
		
//	}
	
	
	//내림차순
/*	@Override
	public int compareTo(Member ai) {
		if(this.score < ai.score) {
			return 1;
		}else if(this.score == ai.score) {
			return 0;
		}else {
			return -1;
		}
		
	}
*/		

	//	return this.score - ai.score;
//	}
	
	//이름을 가지고 크기 비교
	/*
	 이름은 문자열이라서 뺼셈이 안됨
	 문자열은 이미 Comparable 인터페이스를 implements compareTo 메소드가 존재함
	 */
	
	//return this.name.compareTo(ai.name); //이름 오름차순
	//return ai.name.compareTo(this.name); //이름 내림차순
//	}
	
}
