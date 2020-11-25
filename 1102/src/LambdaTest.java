import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorImpl implements Comparator<Singer>{

	@Override
	public int compare(Singer o1, Singer o2) {
		// TODO Auto-generated method stub
		return o1.getScore() - o2.getScore();
		
	}
	
}

public class LambdaTest {

	public static void main(String[] args) {
		// Singer 3개를 값을 대입해서 저장
		// Singer 의 개수는 알 수 없음
		
		List<Singer> list= new ArrayList<Singer>();
		
		//데이터 삽입
		Singer singer = new Singer();
		singer.setNum(1);
		singer.setName("방탄소년단");
		singer.setScore(20130613);
		list.add(singer);
		
		singer = new Singer(2, "신화", 19980307);
		list.add(singer);
		
		singer = new Singer(3, "오마이걸", 20150600);
		list.add(singer);
		

		//score를 이용해서 오름차순 정렬

		//이 방식은 ComoparatorImpl을 2개 이상 만들어서 사용하는 경우 사용
		list.sort(new ComparatorImpl());
		for(Singer temp : list) {
			System.out.printf("%s\n", temp);
		}
		
		//score의 내림차순 정렬 - anonymous class 이용
		System.out.println("==================");
		list.sort(new Comparator<Singer>() {

			@Override
			public int compare(Singer o1, Singer o2) {
				// TODO Auto-generated method stub
				return o2.getScore() - o1.getScore();
			}

		}); 
		for(Singer temp : list){
			System.out.printf("%s\n", temp);
		}
		
		
		//이름의 내림차순으로 정렬 - 람다 이용
		Collections.sort(list,(singer1, singer2) ->
		singer2.getName().compareTo(singer1.getName()));
			
			System.out.println("==================");
		for(Singer temp : list){
			System.out.printf("%s\n", temp);
		}
		
		System.out.println("==================");
		//list의 모든 요소에게 System.out.println을 수행 시킴
		list.forEach(System.out::println);
			
			
			
	}

}
