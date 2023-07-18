<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 
	커스텀 태그 : java의 문법을 태그화
	
	커스텀 태그 라이브러리 : 비슷한 용도의 커스텀 태그들을 묶어 놓은 라이브러리
	
	taglib 지시자 : 커스텀 태그 라이브러리를 사용하기 위한 설정을 하는 지시자.
 -->	
<!-- 
	커스텀 태그 사용하기
	1. jar(라이브러리) 파일 프로젝트에 가져오기(WEB-INF/lib 폴더에 집어넣기)
	
	2. taglib 지시자를 사용해서 설정 완료하기
		- uri : 어떤 라이브러리를 사용할지 결정
		- prefix : 커스텀 태그 앞에 어떤 접두사를 붙일지 >> 사용 라이브러리를 따라감
	
	3. 사용하기*/
		
 -->
	<table border="1">
		<tr>
			<c:forEach begin="1" end="10" var="i">
				<td>${i}</td>
			</c:forEach>
			
		</tr>
	</table>
	
	<%--
		jsp 주석	: jsp가 servlet으로 변환될 떄 무시함
		
		
	 --%>

</body>
</html>