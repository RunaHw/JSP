package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.dao.MemberDAO;
import com.smhrd.entity.Member;

public class JoinCon implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. 수집
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String gender = request.getParameter("gender");
		String nick = request.getParameter("nick");
		String tel = request.getParameter("tel");
		
		Member member = new Member(id, pw, gender, nick, tel);
		
		
		// 2. 기능실행
		MemberDAO dao = new MemberDAO();
		dao.join(member);
		
		// 3. view 선택
		return "redirect:/goMain.do";
	}

}
