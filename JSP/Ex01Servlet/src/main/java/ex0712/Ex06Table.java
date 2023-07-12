package ex0712;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex06")
public class Ex06Table extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num = request.getParameter("number");
		int n = Integer.parseInt(num);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
			out.print("<table border=1>");
			out.print("<tr>");
				for(int i = 1; i <= n; i++) {
					out.print("<td>"+ i + "</td>");
				}
				out.print("</tr>");
			out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
		
	}

}
