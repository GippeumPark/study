import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HtmlDownload {

	public static void main(String[] args) {
		try {
			//URL생성
			//URl을 만들기 전에 URL에 한글이 있으면 URLEncoder.encode로 인코딩 해야함
			URL url = new URL("http://rss.edaily.co.kr/edaily_news.xml");
		
			//연결 객체 생성
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
			//옵션 설정
			
			//접속 시도 시간을 설정
			//캐시 사용 여부를 설정
			con.setConnectTimeout(30000);
			con.setUseCaches(false);
			
			//전송 방식이 POST 라면 setRequestMethod 호출
			
			//문자열 다운로드이면 BufferedReader를 만들고, 파일 다운로드이면 BufferedInputStream을 생성
			BufferedReader br = new BufferedReader(
					new InputStreamReader(con.getInputStream())); //InputStreamReader까진 똑같고 뒤 괄호안만 달라짐
			
			StringBuilder sb = new StringBuilder();
			while(true) {										//while도 똑같음
				String line = br.readLine();
				if(line==null) {
					break;
				}
				sb.append(line + "\n");
			}
			String content = sb.toString();
			
			System.out.printf("%s\n", content);
			
			//정리 작업
			br.close();
			con.disconnect();
			
			
		}catch(Exception e){
			System.out.printf("예외:%s\n", e.getMessage());
			e.printStackTrace();
		
		}

	}

}
