import java.util.Arrays;


		public class Arrays1 {

			public static void main(String[] args) {
				//배열 생성
				String [] names = 
					{"고예림","강소휘", "문정원", "박정아",
					 "배유나","염혜선", "한송이", "한유미"};
				
				//정렬하는 메소드 호출
				//강소휘, 고예림
				Arrays.sort(names);
				
				//names에서 고예림 의 위치 찾기
				int loc = Arrays.binarySearch(names, "고예림");
				//출력
				System.out.printf("고예림 : %d번째 \n", loc);
				
				//김연경의 위치 찾기
				loc = Arrays.binarySearch(names, "김연경");
				//출력 : 데이터가 없으므로 -2
				System.out.printf("김연경 : %d번째 \n", loc);
			

		

		
	}	
}
