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
		
		// 만약 로그인에 성공했다면, session에 id를 저장해봅시다.
		
		String url = "";
		if(id.equals("smart")&&pw.equals("1234")){
			url = "Ex14Logintrue.jsp";
			session.setAttribute("ID", id);
		}
		else{
			url = "Ex14LoginFalse.jsp";
		}
		response.sendRedirect(url);
	%>
</body>
</html>