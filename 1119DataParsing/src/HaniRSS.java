import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class HaniRSS {

	public static void main(String[] args) {
		//1.
		try {
			//3.
			while(true) {
				//4.
				String addr = "http://rss.kmib.co.kr/data/kmibSpoRss.xml";
				URL url = new URL(addr);
				//5.연결객체 생성
				HttpURLConnection con = (HttpURLConnection)url.openConnection();
				//6.옵션설정
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
				StringBuilder sb = new StringBuilder();
				//7.
				while(true) {
					String line = br.readLine();
					if(line == null) {
						break;
					}
					sb.append(line + "\n");
				}
				String xml = sb.toString();
				br.close();
				con.disconnect();
				System.out.printf("%s\n", xml);
				
				//8. DOM 파싱을 위해서 메모리에 펼치기
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder documentBuilder = factory.newDocumentBuilder();
				InputStream is = new ByteArrayInputStream(xml.getBytes());
				Document document = documentBuilder.parse(is);
				Element element = document.getDocumentElement();
				
				//9.필요한 태그 가져오기
				NodeList titleList = element.getElementsByTagName("title");
				NodeList linkList = element.getElementsByTagName("link");
				
				//10. 출력
				for(int i=0; i<titleList.getLength(); i=i+1) {
					Node item = titleList.item(i);
					Node title = item.getFirstChild();
					System.out.printf("%s:", title.getNodeValue());
					item = linkList.item(i);
					Node link = item.getFirstChild();
					System.out.printf("%s:", link.getNodeValue());
				}
				
				//2. 5분 대기
				Thread.sleep(1000 * 60 * 5);
			}
		} catch (Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
