import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class LogAnalysis {

	public static void main(String[] args) {

		try {
			//1.파일의 내용을 문자열로 읽을 수 있는 인스턴스 생성(내가 가지고 있는 파일의 내용 불러올 때)
			BufferedReader br = new BufferedReader(
					new FileReader("./log.txt"));
			
			//파일의 경로를 제대로 복사했는지 확인
			//예외가 발생하면 파일을 제대로 복사하지 않았거나 경로가 틀린 것
//			System.out.printf("%s\n", br);
			
			//2.데이터를 줄 단위로 읽어서 출력(while~split까지 작업)
			//출력해보고 되면 주석처리하기(실제 하려고 한 작업이 아니기 때문에)	
				//3.데이터 개수를 저장할 변수생성
			int cnt = 0;
			
			//3.IP 주소를 저장하기 위한 Set을 생성
			Set<String> ipset = new HashSet<String>();
			//4.트래픽의 합계를 저장할 변수
			int sum = 0;
			
			
			
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
//				System.out.printf("%s\n", line);

				//3공백을 기준으로 line을 분할
				String [] ar = line.split(" ");
				//3제대로 분할 됐는지 출력해보고 확인 되면 주석처리
//				System.out.printf("%s\n", ar[0]);

				//3.9번째 값이 200인 데이터의 개수 세기 (변수를 만들어서 +1씩 더해주면 됨)
				if(ar[8].equals("200")) {
					cnt = cnt +1;
				}
				//3.IP를 Set에 추가
				ipset.add(ar[0]);
//4.			sum = sum + Integer.parseInt(ar[9]); //오류뜸(NumberFormatException):정수로 바꾸다 실패
				
				int traffic = 0;
				try {
					traffic = Integer.parseInt(ar[9]);
				}catch(Exception e) {}
				//4.변경할 수 있는 경우는 변경된 값을 더하고
				//4.그렇지  않은 경우는 0을 더함
				sum = sum + traffic;
				
				
			}
				//3.정상 응답한 데이터 개수 출력
			System.out.printf("정상응답 :%d개\n", cnt);
			//3.접속한 컴퓨터의 개수
			//3.Set은 중복된 데이터를 저장하지 않음
			System.out.printf("컴퓨터 개수:%d개\n", ipset.size());
			//4.트래픽 합계
			System.out.printf("트래픽 합계:%d\n", sum);

			
			br.close();
			
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
