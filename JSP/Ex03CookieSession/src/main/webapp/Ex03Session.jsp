<%@page import="java.util.ArrayList"%>
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
		// 세션에 데이터 저장하기 
		// 1. 세션 만들기(세션 가져오기)
		// HttpSession session = request.getSession();
		// session은 내장객체
		
		// session에 String data 저장하기
		// .setAttribute("name", (obj)value);
		session.setAttribute("name", "박현우");
		
		// ArrayList
		ArrayList<String> list = new ArrayList<String>();
		list.add("리우석");
		list.add("김동령");
		list.add("김유성");
		
		session.setAttribute("list", list);
		
	%>
	<a href="Ex04Session.jsp">세션확인</a>

</body>
</html>