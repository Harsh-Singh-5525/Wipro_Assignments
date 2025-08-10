<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
    String name = (String) session.getAttribute("name");
    String password = (String) session.getAttribute("password");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Stored Data</title>
</head>
<body>
    <h2>Stored values :</h2>
    <p>Name: <%= name != null ? name : "Not set" %></p>
    <p>Password: <%= password != null ? password : "Not set" %></p>
    <a href="form.jsp">Back to Form</a>
</body>
</html>
