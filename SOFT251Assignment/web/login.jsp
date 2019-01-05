<%-- 
    Document   : login
    Created on : 05-Jan-2019, 10:36:01
    Author     : Daniel Richards
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        
        <h1>Login</h1>
        
        <form action="LoginServlet" method="post">
            Enter User ID: <input type="text" name="userID"><br>
            Enter Password: <input type="password" name="userPass"><br>
            <input type="submit" value="login">
        </form>
        
    </body>
</html>
