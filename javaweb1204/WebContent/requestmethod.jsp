<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request 객체의 메소</title>
</head>
<body>
	클라이언트의 IP 주소 : <%=request.getRemoteAddr() %><br/>
	요청 방식:<%=request.getMethod() %><br/>
	<%
	//요청의 전체 경로
	String requestURL = request.getRequestURI();
	//컨텍스트 경로
	String contextPath = request.getContextPath();
	//전체 경로에서컨텍스 경로를 제외한 부분
	
	//거의 모든 웹 프로그래에서의 전체 경로에서 컨텍스트 경로를 제외한 부분을 가지고 URL 라우팅을 함
	String path = requestURI.servlet;
	%>
	라우팅 경로:<%=path %><br/>
</body>
</html>