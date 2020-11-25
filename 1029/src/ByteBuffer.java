import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;

public class ByteBuffer {

	public static void main(String[] args) {
		// 

		
		
		try {
			//절대 경로를 이용해서 파일에 기록할 수 있도록 PrintStream 생성
			PrintStream pw = new PrintStream("C:\\Users\\20208\\Desktop\\학습폴더\\1029테스트.txt");
			//기록할 내용 만들기
			String msg = "버퍼를 이용한 바이트 출력";
			pw.print(msg.getBytes());
			pw.close();
			
			System.out.printf("기록 성공\n");
			
			//파일에서 버퍼를 이용해서 읽어오기
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream("C:\\Users\\20208\\Desktop\\학습폴더\\1029테스트.txt"));
			byte []r = new byte[bis.available()];
			//읽기
			bis.read(r);
			//문자열로 변환해서 출력
			String str = new String(r);
			System.out.printf("%s\n", str);
			bis.close();
			
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}
		
	}

}
