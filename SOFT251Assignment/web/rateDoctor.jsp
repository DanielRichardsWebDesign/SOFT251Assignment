<%-- 
    Document   : rateDoctor
    Created on : 13-Jan-2019, 17:46:24
    Author     : Daniel Richards
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Users.Doctor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rate Doctor</title>
    </head>
    <body>
        <h1>Rate Doctor</h1>
        
        <%
          Doctor doctor = new Doctor();
          ArrayList<Doctor> storeDoctor = new ArrayList<Doctor>();
          storeDoctor = doctor.deserialize();                      
        %>
    </body>
</html>
