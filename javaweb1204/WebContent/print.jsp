<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>print 와 println의 차이</title>
</head>
<body>
	<%
	//print는 모아서 출력하기 때문에 한 번에 출력할 내용을 나누어서 출력하는 것이 가능
	out.print("<a hr");
	out.print("ef='http://www.daum.net'>다음</a><br>");
	
	//println은 바로바로 출력하기 때문에 한 번에 출력할 내용을 나누어서 출력하면
	//제대로 동작하지 않을 수도 있음
	out.println("<a hr");
	out.println("ef='http://www.daum.net'>다음</a><br>");
	%>

</body>
</html>