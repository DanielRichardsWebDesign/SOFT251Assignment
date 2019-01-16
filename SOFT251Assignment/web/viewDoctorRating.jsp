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
        <title>Student Record</title>
    </head>
    <body>
    <% 
        if (request.getAttribute("doctorRatingRecord") != null) {
            Doctor doctor = (Doctor) request.getAttribute("doctorRatingRecord");
    %>
  
    <h1>Doctor Ratings</h1>
    <div>ID: <%= doctor.getId()%></div>
    <div>First Name: <%= doctor.getFirstName()%></div>
    <div>Last Name: <%= doctor.getLastName()%></div> 
    <div>Rating: <%= doctor.getRating() %></div>
    <% } %>   
    </body>
</html>
