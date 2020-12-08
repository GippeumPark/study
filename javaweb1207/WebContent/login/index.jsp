<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>

	<%	
		//로그인 되어 있는 경우 처리
		if(session.getAttribute("email")!= null){
			out.println(session.getAttribute("nickname") + "님<br/>");
			out.println("<a href='logout.jsp'>로그아웃</a>");
			
		}else{
			//로그인이 안된 경우 처리
			if(session.getAttribute("msg") == null){
				out.println("<a href='login.jsp'>로그인</a>");
			}else{
				//로그인 실패한 경우
				session.removeAttribute("msg");
				out.println("<div>없는 아이디 이거나 잘못된 비밀번호</div>");
				out.println("<a href='login.jsp'>로그인</a>");
				
			}
		}
	%>

</body>
</html>