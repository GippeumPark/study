import java.awt.List;
import java.util.ArrayList;

public class ArrayListMethod {

	public static void main(String[] args) {
		// 문자열 ArrayList 생성
		ArrayList<String> list =
			new ArrayList<String>();
		
		//데이터 추가
			list.add("요한 크루하프");
			list.add("마르코 반바스텐");
			list.add("mother");
			list.add("fataer");
			list.add("brother");;
			list.add(3,"friend");
			list.add("sister");
			
			//데이터 개수 확인
			System.out.printf("데이터개수:%d\nalsg", list.size());
			
			//sister 메시지를 삭제
			//list.remove
			list.remove(5);
			list.remove("brother");

			
			//전체를 순회해서 출력
			for(String holland : list) {
				System.out.printf("holland");
			}
			
			
			//데이터를 정렬
			
			
			
			
			
			
			
			
			
			
		
	}

}
