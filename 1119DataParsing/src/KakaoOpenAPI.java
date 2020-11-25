import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;


public class KakaoOpenAPI {

	public static void main(String[] args) {

		//1.웹의 문자열 가져오기
		String data = null;
		//2.try catch문 작성
		try {
			//3.다운받을 주소
			String addr = "https://dapi.kakao.com/v3/search/book?target=title&query="; 
					
			//4.url에 한글이 포함되어 있으면 인코딩 해줘야 함
			//지금은 한글이 없어서 필요 없음
			addr = addr + URLEncoder.encode("유재하피아노로노래하다", "utf-8");
			
			//5.URL생성 - 위의 주소로			
			URL url = new URL(addr);
			
			//6.url에 연결 객체 생성
			//형변환(HttpURLCOnnection)
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
			//7.옵션설정
			//전송방식이나 헤더설정, 파라미터설정
			con.addRequestProperty("Authorization", "KakaoAK 7bc7f9786acc063f77fe239bfe57477a");
			
			//8.웹에서 문자열을 가져올 스트림 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			//9.가져온 문자열을 저장할 객체 생성
			StringBuilder sb = new StringBuilder();
			
			//10.문자열을 읽어서 sb에 저장
			//sb.append line 뒤 \n은 출력 시 보기좋게 하려고 넣은것이라 안넣어도 상관 없음
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				sb.append(line + "\n");				
			}
			
			//11.데이터 옮기기
			//StringBuilder를 데이터를 저장할 때는 좋지만 이걸 이용해서 파싱을 할 순 없음
			//파싱하기 위해 String으로 옮겨야 함
			data = sb.toString();
			
			//12.연결객체 정리
			br.close();
			con.disconnect();
			
			
		} catch (Exception e) {
			System.out.printf("다운로드 예외: %s\n", e.getMessage());
			e.printStackTrace();
		}
		
		//13.다운로드 받은 데이터 출력
		System.out.printf("%s\n", data);

		//14.원하는 항목만 데이터 수집
		//하기 전 프로젝트 maven pom.xml 만들어 주고 dependency 내용 추가 후 DTO클래스 만들어야 함
		//첫번쨰는 무조건 Object부터 시작
		if(data != null) {
			try {
				//15.시작하는 부분이 { 라서 문자열 JSONObject 객체로 변환
				JSONObject root = new JSONObject(data);
				//book키의 내용을 배열로 가져옴
				JSONArray documents = root.getJSONArray("documents");
				//16.파싱한 결과를 저장할 객체 생성
				List<Book> list = new ArrayList<>();
				//17.배열 순회
				for(int i=0; i<documents.length(); i=i+1) {
					JSONObject book = documents.getJSONObject(i);
					//System.out.printf("%s\n", book);

					//18.데이터 1개를 저장할 객체 생성
					Book b = new Book();
					b.setTitle(book.getString("title"));
					b.setPublisher(book.getString("publisher"));
					b.setPrice(book.getInt("price"));
					list.add(b);
				}

				//20.MySQL 드라이버 클래스 로드
				Class.forName("com.mysql.jdbc.Driver");
				System.out.printf("MySQL 드라이버 로드 성공\n");
				
				//21.데이터베이스 연결
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/ppeum?serverTimezone=UTC" , "root","1111");
				
			
				//19.데이터 출력
				for(Book imsi : list) {
					System.out.printf("%s\n", imsi);
				//21.SQL 실행 객체 생성
				PreparedStatement pstmt = con.prepareStatement("insert into book(title, publisher, price) values(?, ?, ?)");
				pstmt.setString(1, imsi.getTitle());
				pstmt.setString(2, imsi.getPublisher());
				pstmt.setInt(3, imsi.getPrice());
				//SQL 실행
				pstmt.executeUpdate();
				//SQL 실행 객체 종료
				pstmt.close();
				
				}
				con.close();
				
			} catch (Exception e) {
				System.out.printf("파싱 예외: %s\n", e.getMessage());
				e.printStackTrace();
			}
		}
		
	}

}
