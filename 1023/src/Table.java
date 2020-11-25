
public class Table {

		//일련번호 생성을 위한 static 변수
		//static변수는 맨처음 한번만 만들어짐
		private static int autoIncrement;

	
		private int num;
		//setter메소드를 삭제하면 읽기 전용으로 생성됨		
		private String name;
		private String position;
		private String Office;
		private int age;
		
		//생성자
		public Table() {
			//일련번호를 만들어서 num에 저장
			autoIncrement = autoIncrement + 1;
			num = autoIncrement;
		}

	
	public int getNum() {
			return num;
		}

// num을 수정할 수 없게 하려면 setter를 삭제하면 밖에서 수정할 수 없게 됨
// 읽기 전용으로 생성됨
//		public void setNum(int num) {
//			this.num = num;
//		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getPosition() {
			return position;
		}


		public void setPosition(String position) {
			this.position = position;
		}


		public String getOffice() {
			return Office;
		}


		public void setOffice(String office) {
			Office = office;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


	@Override
		public String toString() {
			return "Table [num=" + num + ", name=" + name + ", position=" + position + ", Office=" + Office + ", age="
					+ age + "]";
		}

}
