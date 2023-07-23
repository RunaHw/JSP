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
		// 1. 쿠키 생성하기
		// new Cookie("name","value");
		// 쿠키 값 : String --> cookie는 문자열(text)만 저장가능하다.
		//					  공백, ?, ! 와 같은 특수문자는 허용X
		Cookie cookie = new Cookie("cookie","첫번째쿠키");
		
		// 쿠키 유효기간 설정
		// .setMaxAge(int(단위 : 초));
		cookie.setMaxAge(1*60*60*24*365);
		
		// 2. 쿠키를 응답에 추가
		response.addCookie(cookie);
		
	%>
	
	<a href="Ex02Cookie.jsp">쿠키확인</a>
	
</body>
</html>