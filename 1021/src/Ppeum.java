
public class Ppeum implements Cloneable {
	private int num;
	private String name;
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

	//num과 name의 값이 같으면 동일한 것으로 간주하도록 하는 메소드
	//숫자 데이터와 boolean은 ==로 비교
	//그 이외의 자료형은 equals로 내용 비교
	public boolean equals(Ppeum	ppeum) {
		if(this.num==ppeum.num&&this.name.equals(ppeum.name)) {
			return true;
		}else {
			return false;
		}
	}
	
	//인스턴스 자신의 내용을 복제해서 리턴하는 메소드
	public Ppeum clone() {
		//새로운 인스턴스를 생성하고 현재 인스턴스의 내용을 복제
		Ppeum ppeum = new Ppeum();
		ppeum.num = this.num;
		ppeum.name = this.name;
		return ppeum;
	}
	
	
	@Override
	public String toString() {
		return "Ppeum [num=" + num + ", name=" + name + "]";
	}
	
	
	
}
