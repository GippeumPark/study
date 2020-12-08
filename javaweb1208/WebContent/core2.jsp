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
	java.util.List<String> list = new java.util.ArrayList<String>();
	list.add("방탄소년단");
	list.add("데뷔일130613");
	list.add("팬클럽창단일140706");
	list.add("첫대상2016년");	

//데이터 저장
request.setAttribute("list", list);

//반복문 작성
//key(korea,china,holand,vetnam)는 웬만하면 영어로 작성하고, 값은 아무거나 상관없음
java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
map.put("korea", "대한민국");
map.put("china", "중국");
map.put("holand", "네덜란드");
map.put("vetnam", "베트남");
request.setAttribute("map", map);
%>
<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>
<h3>방탄소년단 기본 정보</h3>
<ul>
<!-- 반복문을 돌리기 때문에 서버에서 배열이나 List를 넘겨주는 경우에는 반드시 인스턴스를 생성해서 넘겨야 함,
	null을 리턴하면 500번 에러가 발생할 수 있음 -->
<!-- 처음 입력시 오류가 생길 경우 lib폴더에 jstl.jar 파일을 안넣었거나 taglib태그를 안넣었거나 둘중 하나 -->
<c:forEach var="item" items="${list}">
	<li>${item}</li>
</c:forEach>
</ul>

<!-- value는 서버에 넘어가고, i는 화면에 보여지는 것 -->
멤버 수 : <select name="cnt">
<c:forEach var="i" begin="1" end="10">
	<option value="${i}">${i}</option>
</c:forEach>
</select>

<!-- map 순회 -->
활동영역 :<br/>
<c:forEach var="item" items="${map}">
${item}<br/>
</c:forEach>

</body>
</html>