<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 출력</title>
</head>
<body>
	<!-- java는 자료구조 클래스가 java.util 패키지에 존재 -->
	<%@ page import="java.util.*" %>
	<%
		//데이터와 문류 : Scala(1개) & Vector(0개 이상)
		//scala : 숫자, boolean, 문자열vector이기도 함),날짜
	int num = 10;%>
	번호:<%=num %><br/>
	
	<%
	//서로 다른 종류의 데이터가 모여서 하나의 의미를 표현
	//DTO 클래스의 인스턴스 또는 MAP
	
	Map<String, Object> map =
		new HashMap<String, Object>();
	map.put("num", 1);
	map.put("name", "ppeum");
	//map은 확장이 쉬움
	map.put("age", 29);
	%>
	<!-- Map의 데이터 출력 -->
	번호:<%=map.get("num")%><br/>
	<!-- 대문자로 name을 출력 -->
	<%
	//사용을 할 때는 원래의 자료형으로 형 변환(자료를 가지고 만들 떈 )
	String name = (String)map.get("name");
	%>
	이름:<%=name.toUpperCase() %><br/>
	<%
	javaweb.User user = new javaweb.User();
	user.setNum(3);
	user.setName("ggomi");
		//DTO 클래스를 이용하면 확장을 하고자 하는 경우 클래스 구조를 변경하고 와야 함
		//user.setAge(29);
	%>
	번호:<%= user.getNum() %><br/>
	이름:<%= user.getName().toUpperCase() %><br/>
	
	<h1>List</h1>
	<%
		//Scala Data의 List
		List<String> webProgramming = new ArrayList<String>();
		
		webProgramming.add("방");
		webProgramming.add("탄");
		webProgramming.add("소");
		webProgramming.add("년");
		webProgramming.add("단");
	%>
	<%for(String temp : webProgramming){
	%>
	<%= temp %><br/>
	<%
		}
	%>

	<h1>Map의 List</h1>	
	<%
		List<Map<String, Object>> caffe = new ArrayList<Map<String, Object>>();
		Map<String, Object> hashmap = new HashMap<String, Object>();
		hashmap.put("name", "스타벅스");
		hashmap.put("menu", "아메리카노");
		caffe.add(hashmap);
		
		hashmap = new HashMap<>();
		hashmap.put("name", "투썸플레이스");
		hashmap.put("menu", "카페라떼");
		caffe.add(hashmap);

		hashmap = new HashMap<>();		
		hashmap.put("name", "망고식스");
		hashmap.put("menu", "녹차라떼");
		caffe.add(hashmap);
			
	%>
	<table border="1">
	<tr>
		<th>카페이름</th>
		<th>커피</th>
	</tr>
	<%for(Map<String, Object> map1 : caffe){ %>
	<tr>
		<td><%=map1.get("name") %></td>
		<td><%=map1.get("menu") %></td>
	</tr>
	<%} %>
	</table>
	
</body>
</html>