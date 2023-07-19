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
		// response로 응답하기
		// 1. URL 준비
		String url="http://www.naver.com/";
		// 2. 응답
		// .sendRedirect("url");
		// 해당 URL로 다시 요청을 보내겠다.
		response.sendRedirect(url);
		
		
		// 페이지 이동 방식
		// 주의 : 하나의 파일에서 페이지이동은 단한번만 일어나야한다!!
		// 1.Redirect
		// - sendRedirect 실행시 302 상태코드를 즉시 응답
		// - 응답받은 브라우저 자동으로 URL로 "다시" 요청을 보내고 그 결과를 응답을 받음
		// - 요청-응답이 2번씩 일어나는 페이지 이동	
		// - 첫 요청에 생성된 req, res와 두번째 요청에 생성된 req, res는 서로 다른 객체이다.
		// - 다시 "요청"하는 방식이기 때문에, 주소창에 적힌 URL이 변동된다.
		
		// 2.Forward
		// - 
	
	%>

</body>
</html>