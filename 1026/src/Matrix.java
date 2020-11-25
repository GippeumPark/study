import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Matrix {

	public static void main(String[] args) {
		//야구 선수 명단 저장
		//야구는 팀별로 분할되어 있음
		
		String [] 와이번스 = {"김강민","이재원","김태훈"};
		String [] 라이온스 = {"강한울","구자욱","김동엽"};
		String [] 이글스 = {"이용규","노수광","이해창"};
		String [] 다이노스 = {"이명기","나성범","양의지"};
		
		
		//2차원 배열로 생성
		//2차원 배열은 각 배열의 데이터에 변경이 되는 경우에는 아무런 문제가 없을 가능성이 높음
		//2차원 배열에 1차원 배열이 추가되면 문제 발생 가능성이 있음
		//배열을 의미하는 데이터와 배열을 같이 저장하지 않기 때문
		String [][] kovo = {와이번스, 라이온스, 이글스, 다이노스};
		
		
		//2차원 배열 출력
		for(int i=0; i<kovo.length; i=i+1) {
			String [] volley = kovo[i];
			if(i==0) {
				System.out.printf("%10s", "와이번스");
			}else if (i==1){
				System.out.printf("%10s", "라이온스");
			}else {
				System.out.printf("%12s", "이글스");
			}	
			for(int j=0; j<volley.length; j=j+1) {
				System.out.printf("%10s", volley[j]);
			}
			System.out.printf("\n");
		}
		
		//테이블 구조의 데이터를 만들 때는 배열과 배열의 의미를 포함하는 데이터를 하나의 묶음으로 만들어서 이 묶음 데이터의 배열을 생성해야 함
		Map<String, Object>map1 = new HashMap<String, Object>();
		//팀 이름을 저장
		map1.put("팀명", "와이번스");
		//선수 명단 배열을 저장
		map1.put("선수", 와이번스);
		
		Map<String, Object>map2 = new HashMap<String, Object>();
		map2.put("팀명", "라이온스");
		map2.put("선수", 라이온스);
		
		Map<String, Object>map3 = new HashMap<String, Object>();
		map3.put("팀명", "이글스");
		map3.put("선수", 이글스);

		
		//Map의 배열을 생성
		ArrayList<Map<String, Object>> players = new ArrayList<Map<String, Object>>();
		
		//데이터 삽입
		players.add(map1);
		players.add(map2);
		players.add(map3);

		//새로운 데이터 생성
		Map<String, Object>map4 = new HashMap<String, Object>();
		map4.put("팀명", "다이노스");
		map4.put("선수", 다이노스);
		//players 에 추가 - 출력하는 부분을 변경할 필요가 없음
		players.add(map4);
		
		//출력하기ㅣ
		for(Map<String, Object> map : players) {
			//팀 이름을 출력 - 형 변환없이 바로 출력
			System.out.printf("%s\t:", map.get("팀명"));
			//선수 명단을 가져오기 - 사용을 할 때는 원래의 자료형으로
			//반드시 형 변환 수행
			String [] player = (String [])map.get("선수");
			for(String imsi : player) {
				System.out.printf("%10s", imsi);
				
			}
			System.out.printf("\n");
		}
		
	}

}
