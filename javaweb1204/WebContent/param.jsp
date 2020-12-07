<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>초기화 파라미터 읽기</title>
</head>
<body>
	<%@ page import="java.io.*" %>
	<%
	//초기화 파라미터 읽기
	String database = application.getInitParameter("database");
	out.print("<div>" + database + "</div>");
	
	//절대 경로를 이용해서 텍스트 파일 내용 읽기
	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Users/a202.08/무제.txt")));
	
	//프로젝트 내의 WebContent/upload/무재.txt 파일 읽기
	//파일 경로 만들기
	String filePath = application.getRealPath("/upload") + "/무재.txt";
	br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
	line = br.readLine();
	br.close();
	out.print("<div>" + database + "</div>");
	%>
</body>
</html>