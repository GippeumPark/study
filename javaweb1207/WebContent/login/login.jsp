<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<form action="loginprocess.jsp" method="post">
	<input type="text" name="email"
	placeholder="이메일을 입력하세요."/><br/>
	<input type="text" name="password"
	placeholder="비밀번호를 입력하세요."/><br/>
	<input type="submit" value="로그인"/>
	
	</form>
</body>
</html>