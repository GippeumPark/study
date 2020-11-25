
public class StringTokenizer {

	public static void main(String[] args) {
		// ,로 구분된 문자열
		// 첫번째 항복은 품목, 두번째 항목은 날짜, 세번째 항목은 수량
		String data1 = "사과,2020-10-27,30";
		String data2 = "바나나,2020-10-27,30";
		
		//data1을 , 로 구분해서 전부 출력
		//StringTokenizer 이용
//		StringTokenizer st1 = new StringTokenizer(data1, ",");
//		
//		//반복문을 이용해서 각 토큰을 출력
//		while(st1.hasMorerTokens()) {
//			System.out.printf("%15s", st1.nextToken());
//		}
//		System.out.printf("\n");

		//split메소드 이용
		String[] sp1=data1.split(",");
		for(String imsi : sp1) {
			System.out.printf("15%s", imsi);
		}
		System.out.printf("\n");
	
		
		//data1과 data2의 3번째 항목은 수량
		//2개의 수량의 합을 구해서 출력
		
		//1.data1과 data2의 3번째 항목을 출력
		String[] x1=data1.split(",");
		String[] x2=data2.split(",");
		System.out.printf("%s\n", x1[2],x2[2]);
		
		//2.데이터를 정수로 변환 - Integer.parseInt
		int y1 = Integer.parseInt(x1[2]);
		int y2 = Integer.parseInt(x2[2]);
		
		//3.합계 구하기
		System.out.printf("합계:%d", y1+y2);
	}

}
