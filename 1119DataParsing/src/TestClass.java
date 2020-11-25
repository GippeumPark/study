import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestClass {
	public static void main(String[] args) {
		//1.웹의 문자열 가져오기
		String data = null;
		//2.try catch문 작성
		try {
			//3.다운받을 주소
			String addr = "http://openAPI.seoul.go.kr:8088/775467665167676133366776497449/json/ListGoodFoodService/1/1000/";
			//4.url에 한글이 포함되어 있으면 인코딩 해줘야 함
			//지금은 한글이 없어서 필요 없음
			//addr = URLEncoder.encode(addr, "utf-8");
			
			//5.URL생성 - 위의 주소로			
			URL url = new URL(addr);
			
			//6.url에 연결 객체 생성
			//형변환(HttpURLCOnnection)
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
			//7.옵션설정
			//전송방식이나 헤더설정, 파라미터설정
			//con.addRequestProperty("헤더이름", "값")
			//con.setRequestMethod(전송방식)
			
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
			
			//11.데이터 없기기
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
		//System.out.printf("%s\n", data);
		
		JSONObject root = new JSONObject(data);
		JSONObject asd = root.getJSONObject("ListGoodFoodService");
		//System.out.printf("%s\n", asd);
		
		JSONArray ar = asd.getJSONArray("row");
		//System.out.printf("%s\n,", ar);
		
		for(int i=0; i<ar.length(); i=i+1) {
			JSONObject f = ar.getJSONObject(i);
			//System.out.printf("%s\n", f);
			System.out.printf("%s:%s\n", f.getString("CTF_NAME"),
					f.getString("CTF_TYPE_NAME"));
		}
		
		
	}
}
