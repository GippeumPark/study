import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HaniHTML {

	public static void main(String[] args) {
		//1. 웹의 내용을 가져오는 부분
		String html = null;
		//2. try문 작성
		try {
			//4.주소 불러오기
			String addr = "http://www.kmib.co.kr/";
			URL url = new URL(addr);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				sb.append(line + "\n");
			}
			html = sb.toString();
			br.close();
			con.disconnect();
			
			
			
		//3.1분 대기
		Thread.sleep(1000*60);
			
		} catch (Exception e) {
			System.out.printf("다운로드 예외: %s\n", e.getMessage());
			e.printStackTrace();
		}
		//5.
		//System.out.printf("%s\n", html);

		//6.html 파싱
		if(html != null) {
			try {
				
				//7.html을 메모리에 펼치기
				Document doc = Jsoup.parse(html);
				//8.선택자를 이용해서 데이터 가져오기
				Elements elements = doc.select("#topSc1 > div.mn_lft > div.mn_headline > div > div > dl > dt > a");
				//9.배열 순회
				for(int i=0; i<elements.size(); i=i+1) {
					Element element = elements.get(i);
					//element.text()를 하면 태그의 내용이 나오고 attr("href")로 할 경우 링크가 나옴
					System.out.printf("%s\n", element.text());
				}
			} catch (Exception e) {
				System.out.printf("파싱 예외: %s\n", e.getMessage());
				e.printStackTrace();
			}
		}
	}

}
