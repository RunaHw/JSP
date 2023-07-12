package ex0712;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex03")
public class Ex03Response extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// response : HttpServletResponse
		//			  응답에 대한 정보를 가지고 있는 객체
		//			  패킷의 헤더(응답 정보)를 저장하고 있고, 수정할 수 있다.
		//			  response로는 직접 응답내용을 작성하지 못해, 출력스트림을 이용해서 작성해야함
		
		// 사용자에게 HTML문서 응답하기
		
		// 1. 우리가 보내는 응답의 형식 무언인지? 지정
		// text/html : HTML 문서를 보낼 것이다. (문서 양식)
		// ; : 구분자
		// charset=utf-8 : 인코딩 방식을 UTF-8로 하겠다.
		
		response.setContentType("text/plain ; charset=utf-8");
		
		// 2. 응답내용을 작성하기 위한 출력스트링 객체를 생성
		// getWriter(); : 출력스트림 객체를 생성하는 메소드
		PrintWriter out = response.getWriter();
		
		// 3. 응답할 내용을 작성
		// 메일(패킷)의 본문에 누적 -> service메소드 종료 후 자동 발송
		// ctrl + f11 : 실행 + 자동 요청
		// 응답 내용의 출력결과 --> response에 지정해둔 형식에 따른다.	
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
			out.print("<h1>환영합니다.</h1>");
		out.print("</body>");
		out.print("</html>");
		
		
		
		
	}

}
