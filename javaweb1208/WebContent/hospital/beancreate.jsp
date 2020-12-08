<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="hospital.Hospital"
id="hos" scope="request"/>

<%
	hos.setHospitalname("참사랑동물병원");
	hos.setHospitalplace("아시안선수촌");
	hos.setHospitalprice(50000);

	//날짜 생성
	//오늘날짜 = java.util.Calendar cal = new java.util.GregorianCalendar(); java.util.Date date = new java.util.Date(cal.getTimeInMillis());
java.util.Calendar cal = new java.util.GregorianCalendar();
java.util.Date date = new java.util.Date(cal.getTimeInMillis());
hos.setHospitalbuilddate(date);

//데이터 출력하는 페이지로 포워딩
RequestDispatcher dispatcher = request.getRequestDispatcher("beandisplay.jsp");
dispatcher.forward(request, response);


%>
	<!-- 태그로 출력하는 포워딩 
	<jsp:forward page="beandisplay.jsp"/> -->
	
