<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Date" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition JSP</title>
</head>
<body>

 <h1>Addition of two Numbers</h1>
 <form action="${pageContext.request.contextPath}/Addition" method="post">
 	Enter First Number : <input type = "text" name="value1" /><br />
 	Enter Second Number : <input type = "text" name="value2" /><br />
 	<input type="submit" value="submit" />
</form>
</body>
</html>