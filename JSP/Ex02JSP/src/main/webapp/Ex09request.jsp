<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	td{
		text-align:center;
	}
</style>
</head>
<body>
	<%	// 2. 파라미터(데이터) 수집
		String name = request.getParameter("name");
		String Java = request.getParameter("Java");
		String Web = request.getParameter("Web");
		String Iot = request.getParameter("Iot");
		String Android = request.getParameter("Android");
		String grade = "F";
		int JAVA = Integer.parseInt(Java);
		int WEB = Integer.parseInt(Web);
		int IOT = Integer.parseInt(Iot);
		int ANDROID = Integer.parseInt(Android);
		
		int average = (JAVA + WEB+ IOT + ANDROID) / 4;
		
		//3. 로직
		if(average >=95 && average <=100){
			grade = "A+";
		}
		else if (average >=90){
			grade = "A";
		}
		else if (average >=85){
			grade = "B+";
		}
		else if (average >=80){
			grade = "B";
		}
		else if (average <80){
			grade = "F";
		}
	%>
	<!-- 응답 내용 완성 -->
	<table border="1">
		<tr>
			<th colspan="2">성적확인프로그램</th>
		</tr>
		<tr>
			<td>이름</td>
			<td><%=name %></td>
		</tr>
		<tr>
			<td>JAVA점수</td>
			<td><%=JAVA %></td>
		</tr>
		<tr>
			<td>WEB점수</td>
			<td><%=WEB %></td>
		</tr>
		<tr>
			<td>IOT점수</td>
			<td><%=IOT %></td>
		</tr>
		<tr>
			<td>ANDROID점수</td>
			<td><%=ANDROID %></td>
		</tr>
		<tr>
			<td>평균</td>
			<td><%=average %></td>
		</tr>
		<tr>
			<td>학점</td>
			<td><strong><%=grade %></strong></td>
		</tr>
		
	</table>
</body>
</html>