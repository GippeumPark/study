<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getparameter 만들기</title>
</head>
<body>
	<!-- 직접쓸 때는 뒤에 ?를 붙임
	뒤에 값을 하나 쓸 때는 0=0 적으면 되고 추가 시 & 붙여 작성
	getreceive.jsp에 값 작성 시 파라미터 값 잘 보고 입력해야함, 안그럼 null나옴 -->
	<a href = "getreceive.jsp?num=1&title=초코파이">제목</a>
	<form method = "get" action = "getreceive.jsp">
		<input type="text"	name="num"
		placeholder="번호를 입력하세요" /><br/>
		<input type="text" name="title"
		placeholder="제목을 입력하세요" /><br/>	
	
	<!-- 버튼 생성 -->
		<input type="submit" value="전송" />
	</form>
</body>
</html>