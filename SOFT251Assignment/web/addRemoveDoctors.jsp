<%-- 
    Document   : addRemoveDoctors
    Created on : 09-Jan-2019, 18:54:00
    Author     : Daniel Richards
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.io.IOException"%>
<%@page import="java.io.ObjectInputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Users.Doctor" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add / Remove Doctors</title>
    </head>
    <body>
        <form action="DeleteDoctorServlet" method="get">
        <select value="doctorID">
            <%
        Doctor doctor = new Doctor();        
        ArrayList<Doctor> storeDoctor = new ArrayList<Doctor>();
        storeDoctor = doctor.deserialize();
                
            for(int i = 0; i < storeDoctor.size(); i++)
            {
                %>
                <option value="<%= storeDoctor.get(i).getId() %>"><%= storeDoctor.get(i).getId() %></option> 
         <% } %>
        </select>
            <input type="submit" value="Remove Doctor">
        </form>
    </body>
</html>
