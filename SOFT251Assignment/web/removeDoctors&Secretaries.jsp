<%-- 
    Document   : addRemoveDoctors
    Created on : 09-Jan-2019, 18:54:00
    Author     : Daniel Richards
--%>

<%@page import="Users.Secretary"%>
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
        <h1>Remove Doctor</h1>
        <form action="DeleteDoctorServlet" method="get">
        <select name="doctorID">
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
        
        <h1>Remove Secretary</h1>
        
        <form action="DeleteSecretaryServlet" method="get">
            <select name="secretaryID">
                <%
                  Secretary secretary = new Secretary();
                  ArrayList<Secretary> storeSecretary = new ArrayList<Secretary>();
                  storeSecretary = secretary.deserialize();
                  
                  System.out.println(storeSecretary.get(0).getId());
                  for(int i = 0; i < storeSecretary.size(); i++)
                  {
                      %>
                      <option value="<%= storeSecretary.get(i).getId() %>"><%= storeSecretary.get(i).getId() %></option>
                 <% } %>
            <select/>
            <input type="submit" value="Remove Secretary">            
        </form>
    </body>
</html>
