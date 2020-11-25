import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
//		HashSet<String> set = new HashSet<String>();
//		
//		set.add("방탄소년단");
//		set.add("BTS");
//		set.add("Billbourd");
//		set.add("MusicAword");
//		set.add("1");
//		//중복된 경우에는 저장 하지 않음
//		set.add("방탄소년단");
//		//전체 출력
//		System.out.printf("%s\n", set);
//		
//		//하나씩 출력
//		for(String language : set) {
//			System.out.printf("%s\n", language);
//		}
//
//	}
		//1-45까지의 숫자를 중복없이
		//6개 입력받아서 정렬한 후 출력
	
		//1.입력을 받기 위한 Scanner 인스턴스를 생성
		Scanner sc = new Scanner(System.in);
	
		
		//2.정수를 저장할 수 있는 TreeSet 인스턴스 생성
		TreeSet<Integer> to = new TreeSet<Integer>();
		
		//3.TreeSet의 데이터가 6개 보다 작다면 계속 수행
		while(to.size()<6) {
			//숫자입력받기
			System.out.printf("1-45사이의 숫자를 입력");
			int su = sc.nextInt();
			//1-45사이의 숫자인지 확인
			if(su < 1 || su > 45) {
				System.out.printf("1-45사이의 숫자를 입력하시오\n");
				continue;
			}
			boolean r = to.add(su);
			//데이터가 중복되었다면
			if(r==false) {
				System.out.printf("이미 입력된 번호입니다\n");
			}
			
			//데이터 출력
			for(Integer data : to) {
				System.out.printf("%d\t", data);
			}
		}
	
	
	
		//스캐너 종료
		sc.close();
	}
}
