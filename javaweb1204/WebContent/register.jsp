<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//파라미터 인코딩 설정
		request.setCharacterEncoding("utf-8");
		//필요한 파라미터 읽어오기
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String pet = request.getParameter("pet");
		
		//서버 측에서도 유효성 검사 해야함 - 클라이언트에서 넘어오는 중간에 데이터 변질 생길 수 있기 때문
		
		
		//필요한 가공과 처리
		
	%>
	이메일:<%=email %><br/>
	비밀번호:<%=password %><br/>
	반려동물이름:<%=pet %><br/>
</body>
</html>