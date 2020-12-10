package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter("/write")
public class write implements Filter {


    public write() {
        
    }


	public void destroy() {
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//로그인 여부 확인
		//Session의 id 값이 있는 지 확인
		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession session = req.getSession();
		
		//로그인이 안된 경우
		if(session == null || session.getAttribute("id") == null) {
			//로그인 페이지로 리다이렉트 (그냥 response 작성 안돼 형변환 해줘야 함)
			//HttpServletResponse resp = (HttpServletResponse)response; 이건 또 다른 방법 
			((HttpServletResponse)response).sendRedirect(req.getContextPath() + "/login");
		}
		//로그인 된 경우
		else {
			//원래대로 처리
			chain.doFilter(request, response);
		}

	}


	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
