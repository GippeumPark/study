<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST 방식의 파라미터 전송</title>
</head>
<body>
	<!-- form method="get"으로 할 경우 페이지 주소에 비밀번호까지 다 나옴 -->
	<form method="post" action="postreceive.jsp">
	<input type="text" name="email" /><br/>
	<input type="text" name="password" /><br/>
	<input type="submit" value="로그인" />	
		<input type="checkbox" name="hobby" value="singer">가수
		<input type="checkbox" name="juni" value="singer">가수겸랩퍼
	</form>
</body>
