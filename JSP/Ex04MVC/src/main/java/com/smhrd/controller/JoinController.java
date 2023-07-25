package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.dao.MemberDAO;
import com.smhrd.entity.Member;

@WebServlet("/join")
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String gender = request.getParameter("gender");
		String nick = request.getParameter("nick");
		String tel = request.getParameter("tel");
		
		// id ~ tel까지 Member로 묶기
		Member member = new Member(id, pw, gender, nick, tel);
		
		// 2. 기능실행
		// 입력받은 정보를 DB-MEMBER 테이블에 저장 >> DAO
		// DAO의 기능을 실행
		MemberDAO dao = new MemberDAO();
		int cnt = dao.join(member);
		// 3. View 선택
		
		
		
		
	}

}
