package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.dao.MemberDAO;
import com.smhrd.entity.Member;

@WebServlet("/update")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String gender = request.getParameter("gender");
		String tel = request.getParameter("tel");
		String nick = request.getParameter("nick");
		
		
		Member member = new Member();
		member.setId(id);
		member.setPw(pw);
		member.setGender(gender);
		member.setTel(tel);
		member.setNick(nick);
		
		MemberDAO dao = new MemberDAO();
		int cnt = dao.update(member);
		
		if(cnt > 0) {
			System.out.println("수정 성공");
			// session에 있는 사용자 정보를 member로 수정
			HttpSession session = request.getSession();
			session.setAttribute("user", member);
		}else {
			System.out.println("수정 실패");
		}
		
		String url = "goMain";
		response.sendRedirect(url);
		
	}

}
