<%-- 
    Document   : createUser
    Created on : 05-Jan-2019, 14:28:53
    Author     : Daniel Richards
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create User</title>
    </head>
    <body>
        <h1>Create User</h1>
        <form action="CreateUserServlet" method="get">
            ID: <input type="text" name="ID"><br>
            First Name: <input type="text" name="firstName"><br>
            Surname: <input type="text" name="surname"><br>
            Password: <input type="password" name="userPass"><br>
            Address: <input type="text" name="address"><br>
            Gender: <input type="text" name="gender"><br>
            DOB: <input type="text" name="dob"><br>
            Age: <input type="text" name="age"><br>
            <input type="submit" value="Create User">
        </form>
    </body>
</html>
