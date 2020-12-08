<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>출력</title>
</head>
<body>
	
	<!-- forwarding
	response.getAttribute("result") -->
	
	<!-- redirect
	결과값을 새로고침해도 새작업이 아닌 완료된 현재페이지만 보여짐 -->
	<%=session.getAttribute("result") %>
</body>
</html>