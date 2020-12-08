<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- jsp 파일에서 /로 시작하면 루트 디렉토리
    Java Resource 디렉토리나 WebContent(webapp)디렉토리 -->
   <%@ page errorPage="error/viewerror.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러가 발생하는 페이지</title>
</head>
<body>
이름:<%=request.getParameter("name").toString()%>
</body>
</html>