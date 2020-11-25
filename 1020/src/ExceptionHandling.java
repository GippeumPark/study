
public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int i =10;
			int j = 0;
			//10을 0으로 나누기 때문에 문제가 발생
			System.out.printf("i/j=%d\n", i/j);
		}catch(Exception e ) {
			System.out.printf("%s\n", e.getMessage());
		}
		System.out.printf("수행\n");

	}

}
