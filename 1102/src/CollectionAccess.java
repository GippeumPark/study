import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class CollectionAccess {

	public static void main(String[] args) {
		// 문자열 리스트 생성
		
		List <String> singer = new ArrayList<String>();
		singer.add("방탄소년단");
		singer.add("오마이걸");
		singer.add("신화");
		singer.add("여자아이들");
		
		//데이터 정렬시 데이터 입력 후 데이터 개수 먼저 새기
		//데이터의 개수를 리턴하는 메소드와 1개의 데이터를 가져오는 메소드를 찾아야 함
		//반복문을 전체 데이터 출력
		//int size(), t get(int index)
		
		int len = singer.size();
		for(int i=0; i<len; i=i+1) {
			System.out.printf("%15s\n", singer.get(i));
				
		}
		System.out.printf("\n");
		
		//Iterator 이용
		Iterator <String> iterator = singer.iterator();
		//다음 데이터가 존재한다면
		while(iterator.hasNext()) {
			//다음 데이터를 출력
			System.out.printf("%15s",iterator.next());
		}
			System.out.printf("\n");
			
			
		//빠른 열거
		for(String temp : singer) {
			System.out.printf("15%s", temp);
		}
		System.out.printf("\n");
		
			
			//스트림 이용
			Stream<String> stream = singer.stream();
			stream.forEach(name -> System.out.printf(
					"15%s\n", name));
		
		
		
	}

}
