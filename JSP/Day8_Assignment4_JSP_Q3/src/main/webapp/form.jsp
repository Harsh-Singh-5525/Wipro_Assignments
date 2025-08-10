<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- sessionform.jsp -->
<!DOCTYPE html>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
    <h2>Enter Details to Store</h2>
    <form action="FirstJsp.jsp" method="post">
        Name: <input type="text" name="name" required /><br/><br/>
        Password: <input type="password" name="password" required /><br/><br/>
        <input type="submit" value="Submit" />
        <input type="reset" value="Reset" />
    </form>
</body>
</html>
