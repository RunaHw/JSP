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
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("ID");
		String pw = request.getParameter("PW");
		
		String url = "";
		if(id.equals("smart")&&pw.equals("1234")){
			url = "Ex14Logintrue.jsp";
		}
		else{
			url = "Ex14LoginFalse.jsp";
		}
		response.sendRedirect(url);
	%>
</body>
</html>