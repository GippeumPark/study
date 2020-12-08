<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그 아웃</title>
</head>
<body>
	<%
		//로그아웃 - 세션을 초기화 하고 메인 페이지로 이동
		session.invalidate();
		//response.sendRedirect("index.jsp");

	%>
		로그아웃하셨습니다.<br/>
		5초 후에 메인 페이지로 이동합니다.<br/>


	<span id="disp"></span>

</body>
<script>

	//5초후에 자동 돌아갑니다
	setTimeout(function(e){
		location.href="index.jsp";
	}, 5000)
	
	//5초 줄어들고 돌아감
 	var x = 5;
	setInterval(function(e){
		document.getElementById("disp").innerHTML = x + "";
		x = x -1
	}, 1000)
</script>

</html>