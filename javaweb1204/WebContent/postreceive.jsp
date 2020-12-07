<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>post 방식 파라미터 읽기</title>
</head>
<body>
	<%
		//postreceive는 자바로 입력 해야 읽을 수 있음
		//post방식은 한글이 입력되면 글자가 깨져 인코딩 처리를 해줘야 함
		request.setCharacterEncoding("utf-8");
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");	
		
		//체크박스는 배열로 읽어야 함
		//체크박스와 select만 배열로 사용 
		//배열 사용 시 반복문을 돌려 출력함
		String [] hobby = request.getParameterValues("hobby");
		
	%>
	email:<%=email %><br/>
	password:<%=password %><br/>
	취미:
	<%
	for(String h : hobby){
	%>		
		<%=h %><br/>	
	<%} %>
	<br/>

</body>
</html>