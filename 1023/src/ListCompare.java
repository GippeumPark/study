import java.util.ArrayList;
import java.util.LinkedList;

public class ListCompare {

	public static void main(String[] args) {
		ArrayList<String> ppeum = 
				new ArrayList<String>();

		ppeum.add("0");
		ppeum.add("3");
		
		LinkedList<String> ggo = 
				new LinkedList<String>();

		ggo.add("0");
		ggo.add("3");
		
		//LinkedList에 1을 십만 번 추가
		long start = System.nanoTime();
			for(int i=0; i<100000; i=i+1) {
				ggo.add(1, "1");
			}
		long end = System.nanoTime();
		System.out.printf("LinkedList:%d\n", (end-start));
		
		//ArrayList에 1을 십만 번 추가
		start = System.nanoTime();
		for(int i=0; i<100000; i=i+1) {
			ppeum.add(1, "1");
		}
		end = System.nanoTime();
		System.out.printf("ArrayList:%d\n", (end-start));
	
		
		
		//LinkedList의 전체 데이터 읽기
		start = System.nanoTime();
			for(int i=0; i<100000; i=i+1) {
				ggo.get(i);
			}
		end = System.nanoTime();
		System.out.printf("LinkedList:%d\n", (end-start));
		
		//ArrayList의 전체 데이터 읽기
		start = System.nanoTime();
		for(int i=0; i<100000; i=i+1) {
			ppeum.get(i);
		}
		end = System.nanoTime();
		System.out.printf("ArrayList:%d\n", (end-start));
	
		
		
	}

}
