<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>logging</h3>
	<tags:logging/>
	<br>
	<c:forEach items="${studentList }" var="studentList">
		${studentList.id } / ${studentList.name } / ${studentList.call_cnt } / <fmt:formatDate value="${studentList.reg_dt }"/><br>
	</c:forEach>
	<tags:logging/>

	<h3>color logging</h3>
	<tags:colorLogging color="blue" size="20"></tags:colorLogging>
		<br>
		<c:forEach items="${studentList }" var="studentList">
			${studentList.id } / ${studentList.name } / ${studentList.call_cnt } / <fmt:formatDate value="${studentList.reg_dt }"/><br>
		</c:forEach>
	<tags:colorLogging color="blue" ></tags:colorLogging>
	
	<h3>prodSelect</h3>
	<tags:prod lgu="P101"></tags:prod>
</body>
</html>