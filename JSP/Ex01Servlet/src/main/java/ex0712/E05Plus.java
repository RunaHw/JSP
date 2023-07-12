package ex0712;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex05")
public class E05Plus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("number1");
		String num2 = request.getParameter("number2");
		
		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
			out.print("<h1>" + num1 + "+" + num2 + "=" + (number1 + number2) + "</h1>");
		
		out.print("</body>");
		out.print("</html>");
		
		// 상태 코드
		// 1. 404 Not Found : 요청을 처리할 Servlet이나 페이지가 없다,
		//  				  - action 속성의 url이 제대로 적혀있는가
		//					  - 요청을 처리항 Sevlet의 UrlMapping 확인
		
		// 2. 500 Interval Server Error
		//					: 서버 프로그램 실핼 중 Error -> Java code내에서 에러 발생
		//					 - Eclipse의 console창에 적힌 에러를 확인
		
		
	}

}
