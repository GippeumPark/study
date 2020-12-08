<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>링크 처리</title>
</head>
<body>
	
</body>
</html>
<%
//파라미터 읽기
String num = request.getParameter("num");

//처리하고 결과 생성
java.util.Map map = new java.util.HashMap<>();
map.put("num", num);
map.put("title", "제목");
map.put("content", "내용");

//데이터를 저장 - 포워딩 할거라서 request에 저장
request.setAttribute("result", map);

//결과 페이지로 이동
RequestDispatcher dispatcher = request.getRequestDispatcher("linkoutput.jsp");
dispatcher.forward(request, response);

%>