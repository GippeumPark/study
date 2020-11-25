import java.io.BufferedReader;
import java.io.FileReader;

public class CharacterRead {

	public static void main(String[] args) {
		try {
			//파일을 문자열 단위로 읽을 수 있는 인스턴스를 생성
			BufferedReader br = new BufferedReader(
					new FileReader("C:\\Users\\20208\\Desktop\\학습폴더\\1005(약간수정).txt"));
			//한 줄 읽기
	//		String line = br.readLine();
//			System.out.printf("%s\n", line);

			StringBuilder sb = new StringBuilder();
//			String msg = "";
			while(true) {						//while~System.out.printf("%s\n",line)으로 하면 출력은 되지만
				//못 읽으면 null을 리턴				통 일자로	출력되어 모아서 한번에 출력되게 하기 위해
				String line = br.readLine();	//String msg=""; 과 msg = msg + line + "\n"; 과 System.out.printf("%s", msg);로 추가
				if(line == null) {
					break;					
				}
//				System.out.printf("%s", line);
//				msg = msg + line + "\n";
				sb.append(line + "\n"); //읽은 내용을 sb에 추가
			}
			String msg = sb.toString(); //StringBuilder를 String으로 변환
			System.out.printf("%s", msg);
			
			br.close();
			
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
