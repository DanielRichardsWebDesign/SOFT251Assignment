/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Users.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author Daniel Richards
 */
@WebServlet(name = "CreateUserServlet", urlPatterns = {"/CreateUserServlet"})
public class CreateUserServlet extends HttpServlet implements java.io.Serializable {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String userID = request.getParameter("ID");
        String firstName = request.getParameter("firstName");
        String surname = request.getParameter("surname");
        String password = request.getParameter("userPass");
        String address = request.getParameter("address");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        String age = request.getParameter("age");
        int finalAge = Integer.parseInt(age);
        
        if(userID.startsWith("A"))
        {
           Admin a = new Admin();
           a.setId(userID);
           a.setFirstName(firstName);
           a.setLastName(surname);
           a.setPassword(password);
           a.setAddress(address);
           a.setSex(gender);
           a.setDob(dob);
           a.setAge(finalAge);
                             
           try
           {
               FileOutputStream adminOut = new FileOutputStream("C:\\Users/Daniel Richards/Documents/admin.ser");
               ObjectOutputStream out = new ObjectOutputStream(adminOut);
               out.writeObject(a);
               out.close();
               adminOut.close();
               
           }catch(IOException i){
               i.printStackTrace();
           }
        }
        
        if(userID.startsWith("D"))
        {
           Doctor d = new Doctor();
           d.setId(userID);
           d.setFirstName(firstName);
           d.setLastName(surname);
           d.setPassword(password);
           d.setAddress(address);
           d.setSex(gender);
           d.setDob(dob);
           d.setAge(finalAge);
                             
           try
           {
               FileOutputStream doctorOut = new FileOutputStream("C:\\Users/Daniel Richards/Documents/doctor.ser");
               ObjectOutputStream out = new ObjectOutputStream(doctorOut);
               out.writeObject(d);
               out.close();
               doctorOut.close();
               
           }catch(IOException i){
               i.printStackTrace();
           }
        }
        
        if(userID.startsWith("P"))
        {
           Patient p = new Patient();
           p.setId(userID);
           p.setFirstName(firstName);
           p.setLastName(surname);
           p.setPassword(password);
           p.setAddress(address);
           p.setSex(gender);
           p.setDob(dob);
           p.setAge(finalAge);
                             
           try
           {
               FileOutputStream patientOut = new FileOutputStream("C:\\Users/Daniel Richards/Documents/patient.ser");
               ObjectOutputStream out = new ObjectOutputStream(patientOut);
               out.writeObject(p);
               out.close();
               patientOut.close();
               
           }catch(IOException i){
               i.printStackTrace();
           }
        }
        
        if(userID.startsWith("S"))
        {
           Secretary s = new Secretary();
           s.setId(userID);
           s.setFirstName(firstName);
           s.setLastName(surname);
           s.setPassword(password);
           s.setAddress(address);
           s.setSex(gender);
           s.setDob(dob);
           s.setAge(finalAge);
                             
           try
           {
               FileOutputStream patientOut = new FileOutputStream("C:\\Users/Daniel Richards/Documents/secretary.ser");
               ObjectOutputStream out = new ObjectOutputStream(patientOut);
               out.writeObject(s);
               out.close();
               patientOut.close();
               
           }catch(IOException i){
               i.printStackTrace();
           }
        }
    }
}
