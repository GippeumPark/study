import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		//Movie 인스턴스 1개를 생성하고 값을 설정

		Movie movie = new Movie();
		movie.setNum(1);
		movie.setMovieTitle("내머릿속에지우개");
		movie.setActor("손예진,정우성");
		movie.setMovieRating(15);
		movie.setDate(20101121);
		movie.setRatingAverage(8.3);
		movie.setCnt(2000000);
		
		
		//Movie 인스턴스의 값을 각각 출력
//		System.out.printf("번호:%d, 제목:%s, 주연배우:%s\n", movie.getNum(), movie.getTitle(),movie.getActor());
	
		//DTO 대신 사용하는 Map
		Map<String, Object> map = new HashMap<String, Object>();
		//데이터 저장
		map.put("Num:",1);
		map.put("Movietitle", "내머릿속에지우개");
		map.put("acter","손예진,정우성");
		
		//데이터 출력
		Set<String>keySet = map.keySet();
		for(String key : keySet) {
			System.out.printf("%s:%s\n", key, map.get(key));
		}
		
	}
}	