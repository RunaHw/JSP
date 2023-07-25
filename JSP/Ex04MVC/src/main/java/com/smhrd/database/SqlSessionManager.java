package com.smhrd.database;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class SqlSessionManager {

	// 기존의 JDBC 코드는 문제가 있음
	// 1. 길다?
	// 2. SQL문을 실행하고 결과를 만드는 과정이 복잡함
	// 3. Connection은 기능이 실행될 떄마다 생성됨
	// 많은 사람들이 몰리면 한번에 Conn이 많이 생겨서 서버 과부하
	// Conn이 응답 속도를 느리게하는 주범

	// DataBase Connection Pool (DBCP)
	// Connection을 미리 일정 갯수를 만들어 놓고, 대여하고 반납받는 형식
	// 0. 필요한 라이브러리 dependency 추가( ojdbc6, Mybatis )

	// 1. properties 파일에 DB연결에 필요한 정보를 세팅
	// 2. Mybatis를 사용하기 위한 설정 파일(XML) 세팅
	// 3. 위에서 기술해놓은 config.xml을 이용해서 Connection Pool 생성하기

	// ctrl + shift + o
	// Connection Pool을 가지고 있는 주체
	private static SqlSessionFactory sqlSessionFactory;

	 public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public static void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		SqlSessionManager.sqlSessionFactory = sqlSessionFactory;
	}

	static{ 
		 // 초기화 블럭 : 생성자가 실행될 때, 자동으로 실행
		 // static 초기화 블럭 : 프로그램이 시작되자마자 실행
		try {
			String resource = "com/smhrd/database/config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
