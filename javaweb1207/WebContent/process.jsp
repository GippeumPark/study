<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//파라미터 읽어오기
	String first = request.getParameter("first");
	String second = request.getParameter("second");
	
	//처리
	int result = Integer.parseInt(first) + Integer.parseInt(second);
	System.out.printf("작업을 처리\n");

			
	//결과 저장
	//request.setAttribute("result", result);
	session.setAttribute("result", result);
	
	//결과페이지로 포워딩
	/*
	RequestDispatcher dispatcher = request.getRequestDispatcher("output.jsp");
	dispatcher.forward(request, response);
	*/
	
	//결과 페이지로 리다이렉트
	response.sendRedirect("output.jsp");
%>
