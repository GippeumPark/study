package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//login, logout, write 요청에 반응하는 서블릿을 생성
@WebServlet({ "/login", "/logout", "/write" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//전체 요청 경로 가져오기
		String requestURI = request.getRequestURI();
		//프로젝트 경로 가져오기
		String contextPath = request.getContextPath();
		//공통된 부분을 제외
		String command = requestURI.substring
				(contextPath.length() + 1);
		
		//세션을 미리 생성	
		HttpSession session = request.getSession();
		
		//포워딩에 사용할 변수를 생성
		RequestDispatcher dispatcher = null;
		
		//요청 방식 가져오기
		String method = request.getMethod();
		
		//login 요청을 GET 방식으로 한 경우 : 로그인 페이지로 이동
		if(command.equals("login") && method.equals("GET")) {
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}

		//login 요청을 POST 방식으로 한 경우 : 로그인 처리
		else if(command.equals("login")
				&& method.equals("POST")) {
			//파라미터 읽기
			String id = request.getParameter("id");
			String password = request.getParameter("pw");
			//요청 처리
			
			//결과를 저장
			session.setAttribute("id", id);
			session.setAttribute("nickname", "꼬미쁘미");
			//필요한 곳으로 리다이렉트 - jsp 파일로 리다이렉트하면 안됨
			//브라우저 창에 출력되는 페이지의 파일명이노출됨
			response.sendRedirect(contextPath);
		

		}
		//write 요청 처리
			else if(command.equals("write") && method.equals("GET")) {
			dispatcher = request.getRequestDispatcher(
					"write.jsp");
			dispatcher.forward(request, response);			
		}

	
	//logout 요청 처리
		else if(command.equals("logout") & method.equals("GET")) {
		session.invalidate();
		response.sendRedirect(contextPath);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
