<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.smhrd.entity.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>회원목록</h1>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>NICK</td>
			<td>GENDER</td>
			<td>TEL</td>
		</tr>

		<tr>
			<c:forEach var="member" items="${list}">
				<td>${member.id}</td>
				<td>${member.nick}</td>
				<td>${member.gender}</td>
				<td>${member.tel}</td>
			</c:forEach>

		</tr>
	</table>
</body>
</html>