<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<!-- 누르면 입력 화면 나오고 입력 -->
<!-- table을 하면 위아래 간격 맞춰서 편함 -->
	<form method="Post">
		<table>
			<tr>
				<td align=right>아이디</td>
				<td align="left" style="padding-left:20px">
					<input type="text" name="id" size="15">
				</td>
			</tr>
			<tr>
				<td align=right>비밀번호</td>
				<td align="left" style="padding-left:20px">
					<input type="text" name="pw" size="15">
				</td>			
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="로그인" style="width:100px;"/>
					<input type="reset" value="취소" style="width:100px;"/>
					<input type="button" value="메인으로" style="width:100px;" id="mainbtn"/>
				</td>
			</tr>			
		</table>
	</form>
</body>
</html>