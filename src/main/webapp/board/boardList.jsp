<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="kr.or.ddit.board.service.BoardService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="kr.or.ddit.board.model.BoardVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	th, td{
		border : 1px solid pink;
	}
</style>
</head>
<body>
	<%
		List<BoardVo> list = (List)request.getAttribute("boardList");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//이 부분은 자바코드 작성 방법이 적용된다.
	%>
	<table>
		<thead>
			<tr>
				<th>제목</th>
				<th>글내용</th>
				<th>사용자 아이디</th>
				<th>별명</th>
				<th>등록일(yyyy-MM-dd)</th>
			</tr>
		</thead>
		<tbody>
			<%for(int i = 0; i < list.size(); i++){%>
				<tr>
					<td><%=list.get(i).getTitle() %></td>
					<td><%=list.get(i).getContent() %>
					<td><%=list.get(i).getUserId() %></td>
					<td><%=list.get(i).getAlias() %></td>
					<td><%=sdf.format(list.get(i).getRegDt()) %></td>
				</tr>
			<%}%>
		</tbody>
	</table>
</body>
</html>