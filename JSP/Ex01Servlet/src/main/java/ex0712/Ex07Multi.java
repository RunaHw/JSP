package ex0712;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex07")
public class Ex07Multi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String num1 = request.getParameter("number1");
		String num2 = request.getParameter("number2");
		
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
			out.print("<table border=1>");
				for(int i = n1; i <= n2; i++) {
					out.print("<tr>");
					for(int j =1; j<=9; j++) {
						
						out.print("<td>"+ i+"*"+j+"="+(i*j) +"</td>");
						
					}
					out.print("</tr>");
				}
			out.print("</table>");
		out.print("</body>");
		out.print("</html>");

	}

}
