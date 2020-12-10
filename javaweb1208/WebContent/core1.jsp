<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- jstl의 core 기능 사용을 위한 설정 -->
    <%@ taglib prefix="c"
    	uri="http://java.sun.com/jsp/jstl/core" %>
    <%
    	//세션에 email을 저장
    	session.setAttribute("email", "ppeum12@gmail.com");
 	   session.setAttribute("nickname", "쁘미꼬미");
    %>	
    	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>
<!-- 출력할 때 종류 2가지(값은 똑같이 나오므로 개발자의 취향대로 작성하면 됨 -->
<%-- <c:if test="${email == null }">
<a href="login">로그인</a>
</c:if>
<c:if test="${email != null }">
${nickname }님
<a href="logout">로그아웃</a>
</c:if> --%>

<c:choose>
<c:when test="${email==null }">
</c:when>
<c:otherwise>
${nickname }님
<a href="logout">로그아웃</a>
</c:otherwise>
</c:choose>


</body>
</html>