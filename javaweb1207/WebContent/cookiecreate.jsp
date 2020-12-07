<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 생성</title>
</head>
<body>
	<%
		//쿠키 완성
		Cookie cookie = new Cookie("nickname", "seokjin");
	
		//쿠키의 수명 설정 (브라우저에 쿠키 추가 하기전에 설정)
		//팝업창에 이게 설정 되어있으면 시간(기간)만큼 후에 삭제되어 안보여지게 됨
		//컴퓨터 상에 자주 보이는 것 : 컴퓨터 업데이트 
		cookie.setMaxAge(60);
		
		//브라우저에 쿠키 추가
		response.addCookie(cookie);
	%>
	<!-- 쿠키 링크 생성 -->
	<a href="cookieview.jsp">쿠키 확인</a>
</body>
</html>