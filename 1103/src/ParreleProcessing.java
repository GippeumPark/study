import java.util.Arrays;
import java.util.List;

public class ParreleProcessing {

	public static void work(int valur) {
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
	}
	
	
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		long start = System.currentTimeMillis();
		list.parallelStream().forEach(it->work(it));
		
		long end = System.currentTimeMillis();
		System.out.printf("순차스트림: %d\n", end-start);

		
		start = System.currentTimeMillis();
		list.parallelStream().forEach(it->work(it));
		
		end = System.currentTimeMillis();
		System.out.printf("병렬스트림: %d\n", end-start);
		
		System.out.printf("코어 개수 :%d\n", Runtime.getRuntime().availableProcessors()	);
		
	}

}
