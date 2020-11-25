
public class BubbleSort {

	public static void main(String[] args) {
		// 정수 배열 생성
		int [] ar = {20,24,17,26,22};
		
		//bubble sort
		//데이터 개수가 n개라고 하면 최대 n-1회전 동안 첫번째 부터 
		//(n-1)-회전수까지 자신의 뒤에 있는 데이터와 비교해서 정렬하는 방식
		int n = ar.length;
		for(int i=0; i<n-1; i=i+1) {
			for(int j=0; j<n-i-1; j=j+1) {
				if(ar[j] > ar[j+1]){
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
			//		temp = ar[j];
				}
				
			}
			//중간 과정을 확인해보기 위해서 반복문 중간에 출력
//			for(int temp : ar) {
//				System.out.printf("%5d", temp);
//			}
//				System.out.printf("\n");
		}
		
		
		
		//정렬 후의 결과를 출력
		for(int temp : ar) {
			System.out.printf("%5d", temp);
		}
			System.out.printf("\n");
	}

}
