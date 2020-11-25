import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CharacterWrite {

	public static void main(String[] args) {
		try {
			//현재 날짜 및 시간을 갖는 인스턴스 생성
			Date date = new Date(); //오류사항 util로 선택하면 날짜시간 까지 나오게 됨(sql선택시 날짜만)
			//기록할 파일을 생성
			//오늘 날짜 만들기
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String today = sdf.format(date);
			FileWriter fw = new FileWriter("./" + today + ".txt", true);

			//날짜와 시간을 모두 문자열로 생성
			//작업 내용과 작업 시간을 파일에 기록하는 것을 로그를 기록한다 라고 함
			//로그를 기록할 때 가장 일반적인 단위가 1일
			sdf=new SimpleDateFormat("yyyy-MM-dd (a) hh:mm:ss");
			String time = sdf.format(date);
			PrintWriter pw= new PrintWriter(fw);
			//기록
			pw.printf("%s\n", time);
			pw.flush();
			
			pw.close();
			fw.close();
			System.out.printf("%s\n", fw,pw);
			
			
			
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
