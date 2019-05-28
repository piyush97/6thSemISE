<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
PrintWriter pout = response.getWriter();
String day = request.getParameter("day");
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/test","hemant","password");
	Statement stmt = (Statement)conn.createStatement();
	ResultSet rs;
	rs= stmt.executeQuery("select * from Flight where weekdays LIKE '%"+day+"%';");
	while(rs.next()){
		pout.println(rs.getInt(1)+" " + rs.getString(2)+" " + rs.getString(3));
		pout.println();
	}
}catch(Exception e){
	e.printStackTrace();
}
%>

</body>
</html>