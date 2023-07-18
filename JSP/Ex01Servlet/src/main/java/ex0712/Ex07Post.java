package ex0712;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex07")
public class Ex07Post extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String text = request.getParameter("text");
		String password = request.getParameter("password");
		String file = request.getParameter("file");
		String color = request.getParameter("color");
		String date = request.getParameter("date");
		String datetime = request.getParameter("datetime");
		// checkbox
		// request.getParameterValues("name");
		// "name" 이름으로 전달 된 모든 데이터를 가져옴
		// String 배열로 리턴
		String[] food = request.getParameterValues("food");
		String gender = request.getParameter("gender");
		String range = request.getParameter("range");
		String song = request.getParameter("song");
		String subject = request.getParameter("subject");
		for (String f : food) {
			if(f==(null)) {
				f = "";
			}
		}
		
//		if(chicken==(null)) {
//			chicken = "";
//			
//		}
//		if(pizza==(null)) {
//			pizza = "";
//			
//		}

		response.setContentType("text/html ; charset=utf-8");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<p>텍스트 : " + text + "</p>");
		out.print("<p>비밀번호 : " + password + "</p>");
		out.print("<p>파일 : " + file + "</p>");
		out.print("<p>색깔 : " + color + "</p>");
		out.print("<p>날짜 : " + date + "</p>");
		out.print("<p>날짜+시간 : " + datetime + "</p>");

		out.print("<p>음식 : ");
		// forEach문
		// python for문과 유사
		// for i in list
		// for ( 꺼내서 담을 변수 선언 : 배열)
		for (String f : food) {

			out.print(f + " ");

		}
		out.print("</p>");

		out.print("<p>범위 : " + range + "</p>");
		out.print("<p>성별 : " + gender + "</p>");
		out.print("<p>노래 : " + song + "</p>");
		out.print("<p>과목 : " + subject + "</p>");
		out.print("</body>");
		out.print("</html>");

	}

}
