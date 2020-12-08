<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, board.*" %>
 <%
 //데이터 생성
 List<Board>list = new ArrayList<Board>();
 
 Board board = new Board();
 board.setWriter("디저트미닛");
 board.setTitle("크리스마스 생일선물 머랭쿠키");
 board.setPrice(22000);
 board.setWritedate(new Date());
 list.add(board);
 
 board = new Board();
 board.setWriter("카페다홍");
 board.setTitle("크리스마스 디저트 럭키박스");
 board.setPrice(11900);
 board.setWritedate(new Date());
 list.add(board);
 
 board = new Board();
 board.setWriter("달달한놀이터");
 board.setTitle("크리스마스 연말 행운선물 포춘쿠키");
 board.setPrice(15900);
 board.setWritedate(new Date());
 list.add(board);
 
 //데이터 저장 
 request.setAttribute("list", list);
 %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"
uri="http://java.sun.com/jsp/jstl/fmt" %>
<body>
<table border="1" align="center">
	<thead>
		<tr>
			<th>작성자</th>
			<th>제목</th>
			<th>가격</th>
			<th>작성일</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="board" items="${list}">
		<tr>
			<td>${board.writer}</td>
			<td>${board.title}</td>
			<td><fmt:formatNumber value="${board.price}" type="currency" pattern="#,###.00"/></td>
			<td><fmt:formatDate value="${board.writedate}" pattern="yyyy/MM/dd (E)"/></td>

		</tr>
		</c:forEach>
	</tbody>
		
</table>
</body>
</html>