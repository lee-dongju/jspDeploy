<%@tag import="java.sql.DriverManager"%>
<%@tag import="java.sql.SQLException"%>
<%@tag import="java.sql.ResultSet"%>
<%@tag import="java.sql.Statement"%>
<%@tag import="java.sql.Connection"%>

<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ attribute name="lgu" type="java.lang.String" required="true"%>
<%@ attribute name="name" type="java.lang.String" required="false"%>

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
		
		String sql = "select prod_id ,prod_name from prod where prod_lgu = '" + lgu + "'";
		rs = stmt.executeQuery(sql);
%>
		<select>
			<% while(rs.next()){%>
				<option value="prod_id">
					<% out.write(rs.getString("prod_id"));%><br>
					<% out.write(rs.getString("prod_name"));%><br>
				</option>
			<%}%>
		</select>
<% 
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		if(rs!=null) try { rs.close(); } catch (SQLException e2) {}
		if(stmt!=null) try { stmt.close(); } catch (SQLException e2) {}
		if(conn!=null) try { conn.close(); } catch (SQLException e2) {}
	}
%>		