
<%@ page language="java" contentType="text/html; charset=UTF-8" %>


<!-- display.jsp -->

<!DOCTYPE html>
<html>
<head>
    
</head>
<body>
    <h2>Data Received</h2>
    <p>Name: <%= request.getParameter("name") %></p>
    <p>Password: <%= request.getParameter("password") %></p>
</body>
</html>
