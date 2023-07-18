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
		int menu_cnt = Integer.parseInt(request.getParameter("num"));
		
	%>
	<form action="Ex11result.jsp">
	<table>
		<tr>
			<th>랜덤당첨 작성</th>
		</tr>
		<tr>
			<td>주제: </td>
			<td><input type="text" name="title"></td>
		</tr>
		<% for(int i = 1; i<=menu_cnt;i++){ %>
		<tr>
			<td>아이템<%=i %>:</td>
			<td><input type="text" name="menu"> </td>
		</tr>
		<%} %>
		<tr><td colspan="2"><button>시작</button><td></tr>
	</table>
	</form>
</body>
</html>