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
	<%for(int i = 1; i < 10; i++){%>
		<tr>
		<%for(int k = 2; k < 10; k++){%>
			<!-- html -->
			<td> <%=k%> * <%=i%> = <%=i*k%></td>
		<%}%>
		</tr>
	<%}%>
</table>
	
</body>
</html>