package com.smhrd.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;
import com.smhrd.entity.Member;

public class MemberDAO {

	// 1. SqlSessionManager의 sqlSessionFactory 받아오기
	private SqlSessionFactory factory = SqlSessionManager.getSqlSessionFactory();
	
	// 2. SQL문 실행 메소드
	public int join(Member member) {
		// 1) 연결을 빌려오기, true == auto commit
		SqlSession session = factory.openSession(true);
		
		// 2) Mapper에 정의된 sql문을 실행
		// 메소드 이름 == SQL문의 키워드(단 select만 빼고)
		// 매개변수가 필수 1개 - id 값 
		//         선택 1개 - parameterType에 지정해준 데이터
		//					parameterType == DAO 메소드의 매개변수
		// i, d, u ==>> 결과가 몇행 변경이 일어났는가 동일하게 나온다.
		int cnt = session.insert("join", member);
		
		// 3) 빌려온 연결 반납
		session.close();
		
		// 4) DAO 메소드 ==> SQL문을 실행하고, 실행 결과를 리턴하는 메소드
		return cnt;
	}
	
}
