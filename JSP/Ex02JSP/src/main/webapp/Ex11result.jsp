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
	<%
		String title = request.getParameter("title");
		String[] menus = request.getParameterValues("menu");
		
		Random ran = new Random();
		int ran_num = ran.nextInt(menus.length);
	%>

	<h1>랜덤당첨결과</h1>
	<p><%=title %></p>

	<p><%=menus[ran_num] %></p>
	

</body>
</html>