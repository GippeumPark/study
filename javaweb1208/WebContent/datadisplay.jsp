<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL을 이용한 출력</title>
</head>
<body>
	쿠키 : ${cookie.cookies.value }<br/>
	attribute : ${msg }<br/>
	초기화 파라미터 : ${initParam.db}<br/>
	일반 파라미터 : ${param.param }<br/>
	List 출력:${list[0] }<br/>
	Map 출력:${map["chanal"] }<br/>
</body>
</html>