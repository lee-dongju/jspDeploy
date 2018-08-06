<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- oracle db의 student 테이블을 조회하여 화면에 출력 -->
<%
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc19";
		String pass = "java";
		conn = DriverManager.getConnection(url, user, pass);
		
		stmt = conn.createStatement();
		
		String sql = "select * from student";
		rs = stmt.executeQuery(sql);
%>
		<%out.write("== 실행 결과 ==");%><br>
		<% while(rs.next()){%>
			<% out.write("STD_UM : " + rs.getInt("std_um"));%><br>
			<% out.write("STD_NAME : " + rs.getString("std_name"));%><br>
			<% out.write("STD_KOR : " + rs.getInt("std_kor"));%><br>
			<% out.write("STD_ENG : " + rs.getInt("std_eng"));%><br>
			<% out.write("STD_MAT : " + rs.getInt("std_mat"));%><br><br>
		<%}%>
<% 
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		if(rs!=null) try { rs.close(); } catch (SQLException e2) {}
		if(stmt!=null) try { stmt.close(); } catch (SQLException e2) {}
		if(conn!=null) try { conn.close(); } catch (SQLException e2) {}
	}
%>		
</body>
</html>