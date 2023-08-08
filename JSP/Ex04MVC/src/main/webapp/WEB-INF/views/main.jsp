<%@page import="com.smhrd.entity.Member"%>
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
		// session에서 사용자정보를 꺼내기
		Member user = (Member)session.getAttribute("user");
	%>
	<h1>회원관리 프로그램</h1>
	
	<ul>
		<!-- 
		회원가입 버튼을 누르면 join.jsp로 이동할 수 있게 만들어 보자
		URLMapping : goJoin
		Controller Class 명 : GoJoinCOntroller
		 -->
		 
		 <!-- 로그인 성공시, 회원정보수정, 회원탈퇴, 회원목록, 로그아웃 -->
		 <%if(user == null){ %>
		<li><a href="goLogin">로그인</a></li>
		<li><a href="goJoin">회원가입</a></li>
		
		<%} else{%>
		<li><a href="logout">로그아웃</a></li>
		<li><a href="goUpdate">회원정보수정</a></li>
		<li><a href="goDelete">회원탈퇴</a></li>
		<li><a href="goList">회원목록</a></li>
		<%} %>
	</ul>


</body>
</html>