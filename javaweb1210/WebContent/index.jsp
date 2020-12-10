<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- jstl의 core 기능을 위한 설정 -->
<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>필터링</title>
</head>
<body>
	<h3>필터링</h3>
	<!-- 로그인 안 된 경우 -->
	<c:if test="${id == null }">
	<a href="${pageContext.request.contextPath}/login">
	로그인
	</a>
	</c:if>
	
	<!-- 로그인 된 경우 -->
	<c:if test="${id != null}">
	${nickname}님 환영합니다.<br/>
	<a href="${pageContext.request.contextPath}/logout">
	로그아웃
	</a>
	</c:if>
	<br/>
	
	<a href="${pageContext.request.contextPath }/write">
	글쓰기
	</a>
</body>
</html>