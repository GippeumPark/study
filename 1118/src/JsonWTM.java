

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;



public class JsonWTM {

	public static void main(String[] args) {
		
		String json = null;
		try {
			//다운로드 받을 URL 생성
			URL url = new URL(
					"http://data.seoul.go.kr/dataList/OA-15774/S/1/datasetView.do");
			//URL에 연결 객체 생성
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			//필요한 옵션이 있으면 설정
			
			//줄단위로 읽어서 저장할 객체 생성
			StringBuilder sb = new StringBuilder();
			//줄 단위로 읽어낼 BufferedReader 객체 생성
			BufferedReader br = new BufferedReader(
					new InputStreamReader(con.getInputStream()));
			//줄 단위로 읽기
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				sb.append(line + "\n");
			}
			json = sb.toString();
			br.close();
			con.disconnect();
			
		} catch (Exception e) {
			System.out.printf("다운로드 실패%s\n", e.getMessage());
			e.printStackTrace();
		}
		//System.out.printf("%s\n", json);
		if(json != null) {
			try {
				//{로 시작하므로 JSON Object로 변환
				JSONObject movieJson = new JSONObject(json);
				//list 키의 내용을 배열로 가져오기
				JSONArray movies = movieJson.getJSONArray("list");
				//System.out.printf("%s\n", movies);
				
				//배열 순회
				for(int i=0; i<movies.length(); i=i+1){
					JSONObject movie = movies.getJSONObject(i);
					//System.out.printf("%s\n", movie);
					//title(문자열) 과 rating(실수)을 추출
					System.out.printf("%s:%f\n", 
							movie.getString("title"),
							movie.getDouble("rating"));
				}
			} catch (Exception e) {
				System.out.printf("파싱 실패%s\n", e.getMessage());
				e.printStackTrace();
			}
		}
	}
	
}
