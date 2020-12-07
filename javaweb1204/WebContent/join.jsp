<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	<h3>회원 가입</h3>
	<form action="register.jsp"
	method="post" id="registerform">
		<input type="text" name="email" id="email"
		placeholder="id를 입력하세요" /><br/>
		<input type="text" name="password" id="password"
		placeholder="비밀번호를 입력하세요" /><br/>
		<input type="text" name="pet" id="pet"
		placeholder="반려동물 이름을 입력하세요." /><br>
		
		<!-- 이미지 불러오기(WebContent 새폴더생성
		<a href="#">의 효과는 마우스 손가락효과 -->
		<a href="#"><img src="image/register.png"
		width="100" height="30"
		id=registerbtn /></a>	
	</form>
</body>
	<script>
	document.getElementById("registerbtn")
	.addEventListener("click", function(e){
	//alert("클릭") alert보다 consol.log를 추천
	//유효성 검사
	var email = document.getElementById("email").value
	if(email.trim().length <= 0){
		alert("이메일은 필수 입력입니다.");
	}
	var password = document.getElementById("password").value
	if(password.trim().length <=0){
		alert("비밀번호는 필수 입력입니다.");
	}
	//유효성 검사를 통과했으면 전송
	//페이지에서 입력을 해야 전송됨
	document.getElementById("registerform")
	.submit();
	
	})

	</script>
</html>