package ex0712;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex04")
public class Ex04Form extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 데이터 수집(파라미터 수집), 사용
		// 데이터가 요청에 담겨있어, request객체로부터 꺼낸다.
		// 파라미터 수집 : 요청 담긴 파라미터(데이터)를 꺼내서 변수에 담는 과정
		//				.getParameter("input name")
		request.setCharacterEncoding("UTF-8");
		String data = request.getParameter("data");
		
		// request.getParamete의 리턴이 String이기 때문에,
		// 숫자로 변환해서 사용하고 싶다면 추가 작업
		String number = request.getParameter("number");
		
		int num = Integer.parseInt(number);
		
		// 응답해주기
		// 입력받은 데이터 : ~~~~
		// 입력받은 숫자 : ~~~~~
		response.setContentType("text/html ; charset=utf-8");
		PrintWriter out = response.getWriter();
		if(data.equals(null)) {
			
		}
		else {
			out.print("<html>");
			out.print("<head>");
			out.print("</head>");
			out.print("<body>");
				out.print("<p>입력받은 데이터 : " + data + "</p>");
				out.print("<p>입력받은 숫자 : " + num + "</p>");
			out.print("</body>");
			out.print("</html>");
		}
		
		
	}

}
