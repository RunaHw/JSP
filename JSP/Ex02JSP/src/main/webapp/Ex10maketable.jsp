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
	<%
		request.setCharacterEncoding("UTF-8");
		int rows = Integer.parseInt(request.getParameter("row"));
		int cols = Integer.parseInt(request.getParameter("col")); 
		
		
	%>
	<h1><%=rows %>층 <br>
	</h1>
	<h1><%=cols %>방
	</h1>

	<table border="1">
		<tr>
			<c:forEach begin="1" end="${param.row}" var="i">
				<tr>
					<c:forEach begin="0" end="${param.col}" var="j">
						<td>${j}</td>
					</c:forEach>
				</tr>
			</c:forEach>
		</tr>
	</table>
	<br>
	<table border="1">

		<% for(int i = 0; i< rows; i++){ %>
			<tr>
				<% for(int j = 0; j <cols; j++){%>
					<td><%=j %></td>
				<% } %>
			</tr>
		<% } %>

	</table>
</body>
</html>