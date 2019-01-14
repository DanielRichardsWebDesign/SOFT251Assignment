<%-- 
    Document   : viewDoctorRating
    Created on : 14-Jan-2019, 15:58:32
    Author     : Daniel Richards
--%>

<%@page import="Users.Doctor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Doctor Rating</title>
    </head>
    <%
      if(request.getAttribute("doctorRatingRecord") != null)
      {
         Doctor doctor = (Doctor) request.getAttribute("doctorRatingRecord");         
      }        
    %>
    
    <body>
        <h1>View Doctor Rating</h1>
        
        <h1>Doctor Rating</h1>
        <        
    </body>
</html>
