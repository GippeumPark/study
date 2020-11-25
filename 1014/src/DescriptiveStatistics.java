
public class DescriptiveStatistics {

	public static void main(String[] args) {
		// 이름 배열
		String [] names = {"꼬미","춘춘","삼삼","모찌"
		};
		for(int i=0; i<names.length; i=i+1) {
			System.out.printf("%10s", names[i]);{
				System.out.printf("\n");
			}
		}
		
		
		//정수 배열
		int[] scores = {50, 60, 70, 80				
		};
		for(int a=0; a<scores.length; a=a+1) {
			System.out.printf("%10d", scores[a]);{
				System.out.printf("\n");
			}
		}
		
		
		//score 가 가장 높은 name을 찾기
		int maxscore = 0;
		//가장 높은 score의 name을 저장할 변수를 생성
		String maxname = "";

		//배열을 순회하면서
		//빠른 열거를 사용하지 않은 이유는 2개의 배열을 이용하기 때문
		for(int i=0; i<scores.length; i=i+1) {
			int score = scores[i];
			//i 번째 name을 대입
			String name = names[i];
			
			
//		for(score : scores) {
			//배열 안의 값과 최대값을 비교해서
			//배열 안의 값이 최대값보다 크면 최대값을 배열 안의 값으로 변경
			
			if(maxscore < score) {
				maxscore = score;
			//가장 큰 값이 변경될 떄 그 떄의 name으로 maxname을 변경
				maxname = name;

			}
			
		}
		
		System.out.printf("가장 큰 이름:%s, 큰 값:%d\n", maxname, maxscore);	
		
		//score가 80에 가까운 데이터와 그 데이터의 name을 조회
		//가까운 데이터를 찾을 떄는 차이가 제일 적은 데이터를 찾아야 함
		//차이는 음수가 없음
		//모든 데이터의 차이를 구해서 그 차이가 최소인 데이터를 찾아야 함
		//스마트폰 애플리케이션 등에서 가까운 곳 찾기에 많이 사용
		
		//차이가 가장 작은 값을 저장할 변수
		int minpay = 100;
		//가장 차이 적은 score의 name을 저장할 변수 생성
		String mindit = "";
		for(int i=0; i<scores.length; i=i+1) {
			int score = scores[i];
			//i 번째 name을 대입

			String name = names[i];
			//80과 score의 차이 구하기
			int distance = score - 80;
	
			//거리는 음수가 없기 때문에 음수가 나오면 -1을을 곱해서 양수를 만들어야 함		
			if(distance < 0) {
				distance = distance * -1;
			}
		
		
			//distance가 가장 작은 데이터 찾기
			if(minpay > distance) {
				minpay = distance;
				mindit = name;
			}
		}
		//출력하기
		System.out.printf("80에게 가장 가까운 이름:%s\n", mindit);
		
	}
}
