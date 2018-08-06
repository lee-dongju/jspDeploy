<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<%@ include file="/common/jquery.jsp" %>

<script>
	$(function(){
		//페이지 로딩 시 select box 설정
		$("select[name=locale]").val("${locale}").prop("selected", true);
		
		//select box 변경시 요청이 되도록 수정
		$("select[name=locale]").change(function(){
			$("form").submit();
		});
	});
</script>

</head>
<body>
<form action="/localeSelect" method="get">
	<c:set var="userId" value="LDJ"/>
	
	<select name="locale">
		<option value="ko">한국어</option>
		<option value="ja">日本の語</option>
		<option value="en">english</option>
	</select>
<!-- 	<input type="submit" value="submit"/> -->
	<br>
	
	<%-- setLocale 태그를 통해 임의로 로케일을 수정 --%>
	<fmt:setLocale value="${param.locale }"/>
	
	<fmt:bundle basename="kr.or.ddit.msg.msg">
		<fmt:message key="hello"/><br>
		<fmt:message key="visitor"><br>
			<fmt:param value="${userId }"/>
		</fmt:message>
	</fmt:bundle>
</form>
</body>
</html>