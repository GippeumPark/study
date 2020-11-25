import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFIle {

	public static void main(String[] args) {
		// 파일이 바이트 단위로 기록하기 위한 스트림 생성
		//생성 후 생기는 오류를 처리(예외가 발생할 수 있으니 예외문 작성하라고 생기는 것임)
		
		try {
			FileOutputStream asd = new FileOutputStream("./byte.java", true);
			//기록할 내용 생성
			String msg = "안녕하세요 파일에 기록합니다.";
			byte []b = msg.getBytes();
			
			//기록
			asd.write(b);
			asd.flush();
			
			//스트림 닫기
			asd.close();
		
			//현재 디렉토리의 byte.txt 파일의 내용을 읽어오기
			FileInputStream fis = new FileInputStream("./byte.java");
			//fis의 전체를 저장할 수 있는 배열을 생성
			byte []r = new byte [fis.available()];
			//읽기
			fis.read();
			//바이트 배열을 문자열로 변환
			String str = new String(r);
			System.out.printf("%s\n", str);
			fis.close();
			
		} catch (IOException e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
