package ex0720;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ex05")
public class Ex05Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 세션 수정
		HttpSession session = request.getSession();
		
		// 수정 == 덮어쓰기
		// 같은 이름으로 다시 저장하면 됨
		session.setAttribute("name", "안현진(수정)");
		
		// 삭제
		// .removeAttribute("name");
		session.removeAttribute("list");
		
		//session.invalidate(); : 세션 닫기
		
		// Ex04Session.jsp로 이동
		response.sendRedirect("Ex04Session.jsp");
		
		
	}

}
