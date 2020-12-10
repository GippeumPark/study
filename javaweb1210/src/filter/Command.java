package filter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class Command implements Filter {
	//파일에 내용을 기록할 스트링 변수를 생성
	PrintWriter pw;
	
    public Command() {
       
	//초기화 메소드
		try {
			//파일에 문자열을 기록할 스트림을 생성
			pw = new PrintWriter(new FileWriter("/Users/a202.08/log.txt", true), true);
			
		}catch(Exception e) {
			System.out.printf("파일의 경로가 잘못 되었습니다.\n");
		}
	}
		//URL에 해당하는 요청이 온 경우 호출되는 메소드
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {		
			//매개변수를 우리가 사용하던 HttpServletRequest로 변경
			HttpServletRequest req = (HttpServletRequest)request;
			
			//클라이언트의 IP 주소 가져오기
			String ip = req.getRemoteAddr();
			//요청 주소 가져오기
			String requestURI = req.getRequestURI();
			//현재 날짜와 시간 생성
			Calendar now = new GregorianCalendar();
			String time = String.format("현재시간:%TF %TT", now, now);

			//write는 버퍼에 기록, print는 출력			
			pw.write("접속한 IP:" + ip + "\n");
			pw.write("요청 URI:" + requestURI + "\n");
			pw.write(time + "\n");
			pw.write("-----------------------------\n");
			//writ를 이용한 경우에는 마지막에 flush를 호출해서 버퍼의 내용을 전부 내보내야 함
			pw.flush();

			//인코딩 설정
			req.setCharacterEncoding("utf-8");
			
			//Controller에 요청을 처리해달라고 하는 부분
			chain.doFilter(request, response);
		}
	    //필터 객체가 소멸될 때 호출되는 메소드
		public void destroy() {
			if(pw != null)
				pw.close();
		}
		
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
