package com.smhrd.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.dao.MemberDAO;
import com.smhrd.entity.Member;

// FrontController 디자인패턴
// 단 한개의 서블릿(FrontController)만 사용
// == 모든 요청을 단 하나의 서블릿으로 처리
// *.do : .do로 끝나는 모든 요청을 받겠다.
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// HasMap 자료구조
	// python의 dict와 유사 : KEY - VALUE 짝지어서 저장, KEY를 이용해서 조회
	// HashMap<Key의 자료형, Value의 자료형>
	private HashMap<String, Controller> handler;
	
	@Override
	public void init() throws ServletException {
		// Serlvet이 메모리에 등록되었을 때 단 한번만 실행
		handler = new HashMap<String, Controller>();
		
		// HashMap에 데이터 넣기
		handler.put("/goMain.do", new GoMainCon());
		handler.put("/goLogin.do", new GoLoginCon());
		handler.put("/login.do", new LoginCon());
		handler.put("/goList.do", new GoListCon());
		
		handler.put("/goJoin.do", new GoJoinCon());
		handler.put("/join.do", new JoinCon());
		
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1. 요청을 구분하기 위해서, 어떤 요청인지 알아내기
		// /Ex04/main.do
		String uri = request.getRequestURI();
		// Ex04
		String cpath = request.getContextPath();

		// 슬라이싱
		String mapping = uri.substring(cpath.length());
		
		String url = null;
		Controller con = null;

		// =======================================================================================

		// 2. 요청을 구분해서 알맞는 코드를 실행
		// HashMap에 저장되어있는 POJO 하나 꺼내오기
		con = handler.get(mapping);
		
		if( con != null) {
			url = con.execute(request, response);
		}

		// ==============================================================================================

		if (url != null) {
			if (url.contains("redirect:/")) {
				// ["redirect", "goMain.do"]
				response.sendRedirect(url.split(":/")[1]);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/" + url + ".jsp");
				rd.forward(request, response);
			}

		}

	}

}
