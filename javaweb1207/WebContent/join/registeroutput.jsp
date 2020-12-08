<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 결과</title>
</head>
<body>
	<%
		//(String)글자 깨져서 형변환 해줘야함
		String msg = (String)session.getAttribute("msg");
		System.out.println("<h3>" + msg + "</h3>");
	%>
</body>
</html>