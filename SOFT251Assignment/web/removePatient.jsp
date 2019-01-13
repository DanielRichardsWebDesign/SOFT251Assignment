<%-- 
    Document   : removePatient
    Created on : 13-Jan-2019, 17:12:18
    Author     : Daniel Richards
--%>

<%@page import="Users.Doctor"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Users.Patient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Patient</title>
    </head>
    <body>
        <h1>Remove Patient</h1>
        <form action="DeletePatientServlet" method="get">
            <select name="patientID">
                <%
                  Patient patient = new Patient();
                  ArrayList<Patient> storePatient = new ArrayList<Patient>();
                  storePatient = patient.deserialize();
                  
                  System.out.println(storePatient.get(0).getId());
                  for(int i = 0; i < storePatient.size(); i++)
                  {
                      %>
                      <option value="<%= storePatient.get(i).getId() %>"><%= storePatient.get(i).getId() %></option>
                 <% } %>
            </select>            
            <input type="submit" value="Remove Patient">
        </form>
    </body>
</html>
