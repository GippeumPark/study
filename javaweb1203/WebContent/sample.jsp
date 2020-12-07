<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 구성 요소 연</title>
</head>
<body>
<!-- 클래스 이름 의 패키지를 줄여쓰기 위한 설정 -->
<%@ page import = "java.util.*" %>
<!-- 불필요한 공백을 제거하기 위한 설정 -->
<%@ page trimDirectiveWhitespaces="true" %>
<%
	Calendar today = new GregorianCalendar();
%>
년도: <%= today.get(Calendar.YEAR) %>년
</body>
</html>