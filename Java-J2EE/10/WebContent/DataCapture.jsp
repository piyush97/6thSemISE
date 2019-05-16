<%@ page import="java.util.*"%>
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
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("A", "A");
		hm.put("B", "B");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		PrintWriter pout = response.getWriter();
		if (hm.containsKey(name) && pass.equals(hm.get(name))) {
			pout.println("Welcome " + name);
			pout.println(new Date());
	%>
	<form action="CalculateTax.jsp" method="get">
		Name : <input type="text" name="name">
		Profession <select name="prof">
			<option>Engineer</option>
			<option>Doctor</option>
		</select><br> Gender <select name="gender">
			<option>Male</option>
			<option>Female</option>
		</select>
		Income: <input type="text" name="salary">
		<input type="submit">

	</form>
	<%
		} else {
	%>
	<jsp:forward page="Login.html"></jsp:forward>
	<%
		}
	%>
</body>
</html>