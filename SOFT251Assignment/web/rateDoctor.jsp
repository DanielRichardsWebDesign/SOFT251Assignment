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
        <form action="RateDoctorServlet" method="get">
            <select name="doctorID">
            <%
              Doctor doctor = new Doctor();
              ArrayList<Doctor> storeDoctor = new ArrayList<Doctor>();
              storeDoctor = doctor.deserialize();

              for(int i = 0; i < storeDoctor.size(); i++)
              {
                 %> 
                 <option value="<%= storeDoctor.get(i).getId() %>"><%= storeDoctor.get(i).getId()%></option>
           <% } %>
            </select><br> 
            Give Score:<br>
            <input type="radio" name="doctorScore" value="1">1 Unacceptable
            <input type="radio" name="doctorScore" value="2">2 Acceptable
            <input type="radio" name="doctorScore" value="3">3 Good
            <input type="radio" name="doctorScore" value="4">4 Very Good
            <input type="radio" name="doctorScore" value="5">5 Excellent
            
            <br>
            
            <input type="submit" value="Give Score">
            <input type="submit" value="View Doctor Rating" onclick="form.action='ViewDoctorRatingServlet';">
            
          </form>          
         
            
            
    </body>
</html>
