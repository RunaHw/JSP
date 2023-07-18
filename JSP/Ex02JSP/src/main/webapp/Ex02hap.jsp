<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		JSP 파일의 동작원리
		
		.jsp .(Servlet) > (컴파일) > .class > (실행) > HTML문서
		
		jsp에 작성한 내용은 Servlet의 service메소드 안으로 들어감
		
		HTML 코드 >> out.wirte() 메소드 안으로 들어갔고
		
		스크립트릿 안 java 코그 >> 형태 그대로~ 들어갔다.
		
		표현식 >> out.print(값);로 변환이 되었다.
	 -->
	<%
	int sum = 0;
	for (int i = 1; i <= 100; i++) {
		sum += i;
	}
	%>



	<h1><%=sum%></h1>








</body>
</html>