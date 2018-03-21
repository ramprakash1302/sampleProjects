<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Search Page</title>
</head>
<body>
<form:form commandName="student" method="POST" action="getStudent">
<center>
RollNo. : <form:input path="rollNo"/><br> 
<input type="submit" value="SEARCH"><input type="reset" value="CLEAR">
</center>
</form:form>
</body>
</html>