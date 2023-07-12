package ex0711;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URLMapping은 중복이 되어서는 안된다.
@WebServlet("/ex02")
public class Ex02Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// request : HttpServletRequest
		// Client가 보낸 요청에 대한 정보를 저장하는 객체
		// Client의 요청이 들어오면, 생성되고 service 메서드의 매개변수로 들어옴
		// Client가 응답받는 순간 메모리에서 소멸된다.

		// 요청을 보낸 Client의 ip주소를 가져오는 메소드
		String ip = request.getRemoteAddr();

		response.setContentType("text/html ; charset=utf-8");
		PrintWriter out = response.getWriter();
		// http://172.30.1.95:8081/Ex01Servlet/ex02
		// 0:0:0:0:0:0:0:1 Ipv6
		// 127.0.0.1 Ipv4
		System.out.println(ip);

		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		if (ip.equals("172.30.1.18")) {
			out.print("<h1>슨생님 안녕하세요.</h1>");
			out.print(
					"<img src='https://c-cl.cdn.smule.com/rs-s90/arr/eb/03/68e23bf1-3386-4121-b990-88ef34e57f86_1024.jpg'></img>");
		} else {
			out.print("<h1>응애</h1>");
			out.print(
					"<img src='https://item.kakaocdn.net/do/c6da697d32943268c295c0417c45356e7154249a3890514a43687a85e6b6cc82'></img>");
		}
		out.print("</body>");
		out.print("</html>");

		// Client의 요청 URI 가져오기
		// Client가 요청한 uri도 가져올 수 있음
//		String uri = request.getRequestURI();
//		System.out.println(uri);

	}

}
