<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("msg", "EL입니다");
	request.setAttribute("msg", "input process, output");
%>

<!-- request로 작성했으니 forward로 작성 -->
<jsp:forward page="output.jsp"/>