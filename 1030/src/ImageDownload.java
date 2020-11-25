import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageDownload {

	public static void main(String[] args) {
		try {
			//다운로드 받은 URL을 생성
			URL url = new URL("https://img.hankyung.com/photo/201904/01.19439017.1.jpg");
			//연결
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			//옵션 설정
			con.setConnectTimeout(55432);
			con.setUseCaches(false);
	
			//문자열 다운로드와 파일 다운로드가 다름으로 확인필요
			BufferedInputStream bis = new BufferedInputStream(con.getInputStream());
			
			//기록할 FileStream 생성
			PrintStream ps = new PrintStream("./2.jpg");
			
			//바이트 배열 단위로 읽어서 ps에 기록
			while(true) {
				byte [] b = new byte[con.getContentLength()];  //byte[665] 숫자를 지정하지 않고 할수도 있음
				//읽기
				int r = bis.read(b);
				//읽은 게 없으면 종료
				if(r<=0) {
					break;
				}
				//읽은 내용을 파일에 기록
				ps.write(b, 0, r);
				
			}
			
			//버퍼에 남아있는 내용 모두 출력
			ps.flush();
			
			//정리
			ps.close();
			bis.close();
			con.disconnect();
			
			
			
		}catch(Exception e){
			System.out.printf("예외:%s\n", e.getMessage());
			e.printStackTrace();
		
		}

	}

}
