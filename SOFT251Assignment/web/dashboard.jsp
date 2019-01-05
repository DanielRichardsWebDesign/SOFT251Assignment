<%-- 
    Document   : dashboard
    Created on : 05-Jan-2019, 11:10:52
    Author     : Daniel Richards
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
    </head>
    <body>
        
        <%
            
        response.setHeader("Cache-Control", "no-cache", "no-store", "must-revalidate");    
        
        if(session.getAttribute("userID") == null)    
        {
            response.sendRedirect("login.jsp");
        }    
        
        %>
        
        <form action="LogoutServlet">
            <input type="submit" value="Logout">
        </form>
        
    </body>
</html>
