<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%!// 선언문 : 필드(전역변수) 선언 또는 메소드를 선언할 때 사용
	//		  스크립트릿 --> service메소드 안으로 들어감 -> 메소드를 선언할 수 없음	
	public int sum(int a, int b) {
		return a + b;
	}%>

	<%
	Random ran = new Random();
	%>

	<!-- 3, 5의 합을 h1태그 사이에 출력 -->
	<h1>
		<%=sum(3, 5)%>
	</h1>


</body>
</html>