<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	td {
		border : 1px solid pink;
	}
</style>
</head>
<body>
<table>
	<%
		//기본객체 : request, response, session
		//out 객체 : servlet의 printWriter와 유사한 객체
		//localhost:8180/jsp/implict/out.jsp
		out.write("sumResult : " + session.getAttribute("sumResult"));
		out.write("<br>");
	%>

	<%
		out.write("<table>");
		for (int i = 1; i < 10; i++) {
			out.write("<tr>");
			for (int k = 2; k < 10; k++) {
				out.write("<td>" + k + " * " + i + " = " + i * k + "</td>");
			}
			out.write("</tr>");
		}
		out.write("</table>");
	%>
</table>
</body>
</html>