<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//파라미터 처리(인코딩)
	request.setCharacterEncoding("utf-8");

	String email = request.getParameter("email");
	String password = request.getParameter("password");
	
	//세션을 초기화
	//session.invalidate();
	session.removeAttribute("email");
	session.removeAttribute("password");
	session.removeAttribute("msg");
	
	
	//email이 ppeum12@gmail.com이고 password 가 1111이면 로그인 성공, 그렇지 않으면 실패
	if(email.equals("ppeum12@gmail.com") && password.equals("1111")){
		//로그인에 성공하면 로그인 여부를 확인해 줄 정보를 저장
		session.setAttribute("email", email);
		session.setAttribute("nickname", "꼬미쁘미");
	}else{
		//실패했을 땐 msg 여기에 정보가 있음
		session.setAttribute("msg", "없는 아이디 이거나 잘못된 비밀번호 입니다.");		
	}
	
	response.sendRedirect("index.jsp");
%>