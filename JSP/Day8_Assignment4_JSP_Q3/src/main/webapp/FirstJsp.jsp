<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
    // Get parameters from form
    String name = request.getParameter("name");
    String password = request.getParameter("password");

    // Store in session
    session.setAttribute("name", name);
    session.setAttribute("password", password);
%>
<!DOCTYPE html>
<html>
<head>
    <title>Successfully Stored</title>
</head>
<body>
    <h2>Name and Password is stored successfully.</h2>
    <a href="SecondJsp.jsp">Click to display your stored data</a>
</body>
</html>
