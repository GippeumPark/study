<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//Cookie 생성
	Cookie cookie = new Cookie("cookies", "쿠키");
	response.addCookie(cookie);

	//request 객체에 attribute 생성
	request.setAttribute("msg", "attribute");
	
	
	//List 와 Map 객체 생성
	java.util.List<String> list = new java.util.ArrayList<>();
	list.add("2020");
	list.add("MAMA");
	list.add("8관왕");
	list.add("축하해");
	
	java.util.Map<String, Object> map =
	new java.util.HashMap<String, Object>();
	map.put("language", "Korean");
	map.put("chanal", "MNET");
	map.put("Time", "21:00");
	
	request.setAttribute("list", list);
	request.setAttribute("map", map);
	
%>

<!-- 포워딩 하기 : 파라미터 전송 -->
<jsp:forward page="datadisplay.jsp?param=value"/>
