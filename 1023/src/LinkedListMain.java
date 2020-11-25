import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		// String을 저장하는 linkedList를 생성
		
		LinkedList<String> list = new LinkedList<String>();
		
		//데이터 추가
		list.add("요한 크루하프");
		list.add("마르코 반바스텐");
		list.add("mother");
		list.add("fataer");
		list.add("brother");;
		list.add(3,"friend");
		list.add("sister");
		
		//데이터 지우기
		list.remove(3);
		
		//데이터 정렬
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
		
		//전체 데이터 순회해서 출력
		for(String 쁨 : list) {
			System.out.printf("%s\n", 쁨);
		}
	
	}

}
