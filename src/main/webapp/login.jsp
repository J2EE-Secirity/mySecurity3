<%--
  Created by IntelliJ IDEA.
  User: alexandr
  Date: 13.05.15
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login</title>
</head>
<body>
<form action="/Servlet/userValidator" method="post">
    Name: <input type="text" name="name"/>
    Password: <input type="password" name="password"/>
    <input type="submit" value="LogIn"/>
</form>
</body>
</html>