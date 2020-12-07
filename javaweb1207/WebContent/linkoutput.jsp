<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>link 페이지 출력</title>
</head>
<body>
	<%
	
		//처리한결과 읽어오기
		java.util.Map<String, Object> map =(java.util.Map<String, Object>)
		request.getAttribute("result");
	System.out.println("번호:" + map.get("num") + "<br/>");
	System.out.println("제목:" + map.get("title") + "<br/>");
	System.out.println("내용:" + map.get("content") + "<br/>");
			
	%>
</body>
</html>