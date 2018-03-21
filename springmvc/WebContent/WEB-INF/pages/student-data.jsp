<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details Page</title>
</head>
<body>
<center>
	<table border="2">
		<tr><td>RollNo. </td><td>${student.rollNo }</td></tr>
		<tr><td>FirstName </td><td>${student.firstName }</td></tr>
		<tr><td>LastName </td><td>${student.lastName }</td></tr>
		<tr><td>Percent </td><td>${student.percent }</td></tr>
	</table>

</center>
</body>
</html>