
public class SelectionSort {

	public static void main(String[] args) {
		// 정렬할 배열 생성
		int[] ar = {19,35,13,92,97,45};
		//데이터 출력
		System.out.printf("초기상태 : ");
		for(int temp : ar) {
			System.out.printf("%d ", temp);
		}
		System.out.printf("\n");
		
		
		//선택정렬
		for(int i=0; i<ar.length; i=i+1) {
			for(int j=i+1; j<ar.length; j=j+1) {
				//앞에 있는 값이 커야 함
				if(ar[i] > ar[j]) {
					//temp 값을 ar[i]로 변경
					int temp = ar[i];
					//[i]값을 [j]값으로 변경
					ar[i] = ar[j];
					//[j]값을 다시 temp로 변경
					ar[j] = temp;
				}
			}
			System.out.printf("중간결과 : ");
			for(int temp : ar) {
				System.out.printf("%d ", temp);
			}
			System.out.printf("\n");
		}
		System.out.printf("처리결과 : ");
		for(int temp : ar) {
			System.out.printf("%d ", temp);
		}
		System.out.printf("\n");
	}

}
