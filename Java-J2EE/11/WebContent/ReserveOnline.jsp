<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ViewDisplay.jsp" method="post">
		<p>
			Name: <input type="text" name="name">
		</p>
		<p>
			Number: <input type="text" name="number">
		</p>
		<p>
			Flight Number: <input type="text" name="fno">
		</p>
		<p>
			Date: <input type="text" name="date">
		</p>
		<input type="submit">
	</form>
	<form action="ShowFlights.jsp" method="get">
	Day: <input type="text" name="day">
	<input type="submit">
	</form>
</body>
</html>