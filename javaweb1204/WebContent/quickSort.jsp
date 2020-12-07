<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quick sort 함수</title>
</head>
<body>

	<%!
	//left는 정렬할 데이터의 시작 위치
	//right는 정렬할 데이터의 마지막 위치
	//data는 정렬할 배열
	
	public void quickSort(int left, int right, int []data){
		for(int imsi : data){
			System.out.printf("%5d", imsi);
		}
		System.out.printf("\n");
		
		//사용할 변수 초기화
		int pivot = left; //비교하는 기준 위치
		int j = pivot; //pivot 데이터가 실제 이동해야 할 위치
		int i = pivot + 1; //비교할 데이터들의 인덱
		
		//right가 left 보다 크면 수행 - 데이터가 2개 이상인 경우
		if(left < right){
			//pivot	다음부터 right 까지 순회
			for(; i<=right; i=i+1){
				//기준 데이터와 비교
				if(data[pivot] > data[i]){
					//j를 1증가 시키고 j번째와 i번째 데이터 스왑
					j=j+1;
					int temp = data[j];
					data[j] = data[i];
					data[i] = temp;
				}
			}
			//pivot과 j번째 데이터 스왑
			int temp = data[j];
			data[j] = data[pivot];
			data[pivot] = temp;
			
			//pivot의 왼쪽 데이터와 오른쪽 데이터를 가지고 다시 수행
			quickSort(left, j-1, data);
			quickSort(j+1, right, data);
		}		
	}
	%>
	<%
	int [] list = {45, 25, 37, 26, 51, 47};
	%>
	<h1>정렬 하기 전 데이터</h1>
	<%
	for(int temp : list){%>
	<span style="border:1px solid red;">
	<%=temp%></span>
	<%}%>
	<br/>
			
	<% quickSort(0, list.length-1, list);  //인덱스를 줘야해 length에 1을 빼줘야 
	%> 

	<h1>정렬 후의 데이터</h1>
	<%for(int temp : list){ %>
		<span style="border:1px solid red;">
	<%=temp%></span>
	<%} %>
	<br/>
</body>
</html>