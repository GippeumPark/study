

public class TempLate {
	public static void disp() {
		System.out.printf(
			"매개변수가 없는 static 메소드 호출\n");
	}
	
	public static void oneArg(String msg) {
		System.out.printf(
			"매개변수가 있는 static 메소드 호출\n");
		System.out.printf(
				"매개변수:%s\n", msg);
	}
	
	public void memberDisp(int mem) {
		System.out.printf(
			"매개변수가 1개 있는 instance 메소드 호출\n");
		System.out.printf("mem:%d\n", mem);
		
	}
	
	public int returnMemberFunc(int m) {
		return m * m;
	}
}

