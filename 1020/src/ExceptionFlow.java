
public class ExceptionFlow {

	public static void main(String[] args) {
		try {
			int [] ar = {20,30,10,50};
			System.out.printf("[0]:%d\n", ar[0]);
			System.out.printf("[4]:%d\n", ar[4]);
		}catch(Exception e) {
			//예외 내용을 출력
			//catch는 여러번 사용 가능하지만 아래에 있는 catch가 하위클래스인 경우에 수식상 문제는 없지만 값에 오류가 생김
			System.out.printf("예외 내용%s\n", e.getMessage());
			//예외 발생 지점을 역추적
			e.printStackTrace();
		//}catch(ArrayIndexOutOfBoundsException e) {
		//	System.out.printf("배열 첨자 예외\n");
		}finally {
			System.out.printf("무조건 수행\n");
			
		
		}

	}

}
