
public class Lotto {

	public static void main(String[] args) {
		// 로또 번호 6개를 저장할 배열 생성
		// 로또 번호 정수
//		String [] names = {"첫번째","두번째","세번째","네번쨰","다섯번째","여섯번째"};		
		
		int [] lotto = new int [6];
			
		//키보드로부터 입력받기 위한 인스턴스 생성
		java.util.Scanner sc = new java.util.Scanner(System.in);
			int len = lotto.length;
				for(int i=0; i<len; i=i+1) {
					System.out.printf("1~45사이의 숫자를 중복되지 않게 입력하세요:");
					lotto[i] = sc.nextInt();
						

			
		//1부터 45사이인지 검사해서 1부터 45 사이가 아니면 경고 메시지를 출력하고
		//무효화 시키는 코드를 작성
			
				//if(lotto[i] < 1 && lotto[i] > 45	) {
					if(!(lotto[i] >= 1 && lotto[i] <=45)) { 
						System.out.printf("1~45 이상의 숫자만 입력 해주세요!!\n");
						i=i-1;
							continue;
					}
			
				
				
				
		//중복 검사
		//두번째 데이터부터 수행
		//첫번째부터 자신의 바로 이전데이터까지 자신과 비교해서 값이 같은 데이터가 있으면 데이터 중복
		//이 경우에도 다시 입력하도록 해주어야 합니다.
		//0->안함 / 1->0 / 2->0,1 / 3->0,1,2 / 4->0,1,2,3 / 5->0,1,2,3,4 / 6->0,1,2,3,4,5		
		//flag 변수는 코드의 일괄 처리를 할 때, 특정 조건을 만족했을 경우 특정 명령을 수행하도록 하기 위해서 사용
	
			if(i > 0) {
				//중복된 데이터가 있는지 확인하기 위한 변수
				boolean flag = false;
				for(int j=0; j<=i-1; j=j+1) {
					//데이터가 중복되었다면 flag를 true로 변경					
				
				if(lotto[i] == lotto[j]) {
					flag = true;
					break;
				}
				
				
			}
			

				//데이터가 중복되었다면
				if(flag == true) {
					System.out.printf("중복된 데이터입니다.\n");
					i = i - 1;
					continue;
		
				}	
			}
	
		}	
	
	
	sc.close();
		
		//버블 정렬을 이용해서 내림차순 정렬하도록 코드를 작성
		//데이터 개수 저장
		int n = lotto.length;
		//회전
		for(int i=0; i<n-1; i=i+1) {
			for(int j=0; j<n-i-1; j=j+1){
				if(lotto[j]<lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];	
					lotto[j+1] = temp;
				}
			}
		}
	
	
		//lotto 배열에 저장된 데이터를 출력
		for(int temp : lotto) {
			System.out.printf("%5d", temp);
		
		}
		System.out.printf("\n");

	}
		
}		


