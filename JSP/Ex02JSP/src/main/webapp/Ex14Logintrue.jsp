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
	String id = (String)session.getAttribute("ID");
%>
	<div><h1><%=id %>님 환영합니다!</h1></div>
	<a href="#">로그아웃</a>
</body>
</html>