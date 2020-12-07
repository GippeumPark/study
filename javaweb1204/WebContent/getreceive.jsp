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
	//파라미터 읽기 (html에서는 읽을 수 없음)
	//form의 데이터를 읽을 때는 name에 설정한 이름을 읽어야 함
	String num = request.getParameter("num");
	String title = request.getParameter("title");
	%>
	입력한 번호:<%= num %><br/>
	입력한 제목:<%= title %><br/>

</body>
</html>