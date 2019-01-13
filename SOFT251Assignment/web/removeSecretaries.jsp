<%-- 
    Document   : removeSecretaries
    Created on : 13-Jan-2019, 16:44:10
    Author     : Daniel Richards
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Users.Secretary"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Remove Secretary</h1>
        
        <form action="DeleteSecretaryServlet" method="get">
            <select name="secretaryID">
                <%
                  Secretary secretary = new Secretary();
                  ArrayList<Secretary> storeSecretary = new ArrayList<Secretary>();
                  storeSecretary = secretary.deserialize();
                  
                  for(int i = 0; i < storeSecretary.size(); i++)
                  {
                      %>
                      <option value="<%= storeSecretary.get(i).getId() %>"<%= storeSecretary.get(i).getId() %></option>
                 <% } %>
            <select/>
            <input type="submit" value="Remove Secretary">            
        </form>
    </body>
</html>
