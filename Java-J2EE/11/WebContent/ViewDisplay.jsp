<%@ page import="java.util.*"%>
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
		String name = request.getParameter("name");
		String number = request.getParameter("number");
		int fno = Integer.parseInt(request.getParameter("fno"));
		int sno = new Random().nextInt(500)+1;
		String date = request.getParameter("date");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/test","hemant","password");
			if(conn!=null){
				Statement stmt = (Statement)conn.createStatement();
				try{
					stmt.executeUpdate("insert into SeatReservation values("+fno+",'"+date+"',"+sno+",'"+name+"',"+number+");");
					pout.println(name+" "+number+" "+date+" "+fno+" "+sno);
				}
				catch(Exception e){
					pout.println("Could not make a reservation");
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	%>
</body>
</html>