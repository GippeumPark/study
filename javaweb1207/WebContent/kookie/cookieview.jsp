<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 연결</title>
</head>
<body>
	<%
		//쿠키 전부 읽기
		Cookie [] cookies = request.getCookies();
		if(cookies != null && cookies.length > 0){
			for(Cookie cookie : cookies){
				out.println(cookie.getName() + ":" + cookie.getValue() + "<br/>");
			}
		}
	%>
</body>
</html>