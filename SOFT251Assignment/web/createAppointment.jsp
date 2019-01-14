<%-- 
    Document   : createAppointment
    Created on : 13-Jan-2019, 17:59:18
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
        <title>Create Appointment</title>
    </head>
    <body>
        <h1>Create Appointment</h1>
        <form action="CreateAppointmentServlet" method="get">
            <form action="CreateUserServlet" method="get">
            Appointment ID: <input type="text" name="ID"><br>    
            Appointment Date: <input type="text" name="date"><br>
            Appointment Time: <input type="text" name="time"><br>
            Patient: <select name="patientID"> 
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
                    </select><br> 
            Doctor: <select name="doctorID">
            <%
                Doctor doctor = new Doctor();
                ArrayList<Doctor> storeDoctor = new ArrayList<Doctor>();
                storeDoctor = doctor.deserialize();
                
                System.out.println(storeDoctor.get(0).getId());
                for(int i = 0; i < storeDoctor.size(); i++)
                {                    
                    %>
                    <option value="<%= storeDoctor.get(i).getId() %>"><%= storeDoctor.get(i).getId() %></option>
             <% } %>
            </select><br>                        
            <input type="submit" value="Create Appointment">
        </form>
    </body>
</html>
