<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>
</head>
<body>
<form:form method="POST" commandName="student" action="saveStudent">
<center>
	<table>
		<tr>
			<td>RollNo. : </td>
			<td><form:input path="rollNo"/> </td>
		</tr>
		<tr>
			<td>FirstName : </td>
			<td><form:input path="firstName"/> </td>
		</tr>
		<tr>
			<td>LastName : </td>
			<td><form:input path="lastName"/> </td>
		</tr>
		<tr>
			<td>Percent : </td>
			<td><form:input path="percent"/> </td>
		</tr>
		<tr>
			<td><input type="submit" value="ADD"></td>
			<td><input type="reset" value="CLEAR"></td>
		</tr>
	</table>
</center>
</form:form>
</body>
</html>