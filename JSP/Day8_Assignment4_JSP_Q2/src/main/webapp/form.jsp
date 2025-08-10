

<!-- loginform.jsp -->

<!DOCTYPE html>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
    <h2>Login</h2>
    <form action="LoginJsp.jsp" method="post">
        Name: <input type="text" name="name" required /><br/><br/>
        Password: <input type="password" name="password" required /><br/><br/>
        <input type="submit" value="Submit" />
        <input type="reset" value="Reset" />
    </form>
</body>
</html>
