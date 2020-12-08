<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다른 페이지 포함</title>
</head>
<body>
	<jsp:include page="variable.jsp" />
	다른 페이지를 포함할 페이지
	
	<!-- 이 방식으로는 다른 파일에 있는 변수를 사용할 수 없음 -->
	<!-- 결과를 포함시키는 방식 -->
	<!-- <jsp:include page="variable.jsp" /> -->

	<!-- 코드를 포함시키는 방식 - 변수도 사용이 가능 -->		
	<%@ include file="variable.jsp" %>
	<%= a %>
	
</body>
</html>