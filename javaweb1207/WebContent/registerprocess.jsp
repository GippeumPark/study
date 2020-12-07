<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	//파라미터 인코딩 처리
	request.setCharacterEncoding("utf-8");

	//파라미터 읽기
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	String nickname = request.getParameter("nickname");
	String phone = request.getParameter("phonenum");
	String car = request.getParameter("car");

	System.out.println(email);
	System.out.println(password);
	System.out.println(nickname);
	System.out.println(phone);
	System.out.println(car);


	
	
	//처리
	
	//결과 저장
	session.setAttribute("msg", "회원가입 성공");
	
	//결과 페이지로 이동
	response.sendRedirect("registeroutput.jsp");
	
%>