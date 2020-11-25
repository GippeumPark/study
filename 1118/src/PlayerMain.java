import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PlayerMain {

	public static void main(String[] args) {
		//파일 내용을 줄 단위로 읽을 수 있는 객체를 저장할 변수 생성
//		BufferedReader br = null;
		//try() 안에 만든 객체는 닫기를 호출하지 않아도 됨
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\20208\\Desktop\\학습폴더\\volleyball.csv")));
					//데이터를 파싱해서 저장하기 위한 객체를 생성
					List<Player> list = new ArrayList<>();

					//첫번째 줄인지 확인하기 위한 변수
					boolean flag = false;
					while(true) {
						//한 줄 읽고
						String line = br.readLine();
						//첫번 쨰 줄 이 없으면 진행
						if(flag == false) {
							flag = true;
							continue;
						}
						//읽은 게 없으면 반복문 종료
						if(line == null) {
							break;
						}
						//읽은 데이터가 있는 경우 처리
						//System.out.printf("%s\n", line);
						
						//, 로 구분해서 읽기
						String [ ] ar = line.split(",");
						
						//구분한 데이터를 가지고 Player 객체 생성
						Player player = new Player();
						player.setName(ar[0]);
						player.setAge(Integer.parseInt(ar[1]));
						player.setBirth(ar[2]);
						player.setEmail(ar[3]);
						player.setNickname(ar[4]);
						
						list.add(player);
						
						
					}
		//목록 출력
		for(Player player : list) {
			System.out.printf("%s\n", player);
		}
					
		} catch (Exception e) {
			System.out.printf("읽기 예외:%s\n", e.getMessage());
			e.printStackTrace();
		}
		
		//
	}

}
