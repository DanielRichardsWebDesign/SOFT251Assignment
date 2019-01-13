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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        String password = request.getParameter("userPass");
        String firstName = request.getParameter("firstName");
        String surname = request.getParameter("surname");        
        String address = request.getParameter("address");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        String age = request.getParameter("age");
        int finalAge = Integer.parseInt(age);
        boolean accountStatus = false;
        
        
        if(userID.startsWith("A"))
        {     

            ArrayList<Admin> tempAdmins = new ArrayList<Admin>();
           
            try
            {
                FileInputStream fileAdminIn = new FileInputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\doctor.ser\\admin.ser");
                ObjectInputStream adminObjIn = new ObjectInputStream(fileAdminIn);
                tempAdmins = (ArrayList<Admin>) adminObjIn.readObject();
                
                adminObjIn.close();
                fileAdminIn.close();
            }
            catch(IOException | ClassNotFoundException e)
            {
                
            }
           
            for(int i = 0; i < tempAdmins.size(); i++)
            {
                System.out.print(tempAdmins.get(i).getFirstName());
            }
            
           //ArrayList<Admin> tempAdmins = new ArrayList<Admin>();
           
            tempAdmins.add(new Admin(userID, password, firstName, surname, address, gender, dob, finalAge));

           try
           {
               FileOutputStream adminOut = new FileOutputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\doctor.ser\\admin.ser");
               ObjectOutputStream out = new ObjectOutputStream(adminOut);
               out.writeObject( tempAdmins);
               out.close();
               adminOut.close();

           }catch(IOException i){
               i.printStackTrace();
           }           

           response.sendRedirect("createUser.jsp");
        }
        
        if(userID.startsWith("D"))
        {
           ArrayList<Doctor> tempDoctor = new ArrayList<Doctor>();
           
            try
            {
                FileInputStream fileDoctorIn = new FileInputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\doctor.ser");
                ObjectInputStream doctorObjIn = new ObjectInputStream(fileDoctorIn);
                tempDoctor = (ArrayList<Doctor>) doctorObjIn.readObject();
                
                doctorObjIn.close();
                fileDoctorIn.close();
            }
            catch(IOException | ClassNotFoundException e)
            {
                
            }
           
            for(int i = 0; i < tempDoctor.size(); i++)
            {
                System.out.print(tempDoctor.get(i).getFirstName());
            }            
                      
           tempDoctor.add(new Doctor(userID, password, firstName, surname, address, gender, dob, finalAge));

           try
           {
               FileOutputStream doctorOut = new FileOutputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\doctor.ser");
               ObjectOutputStream out = new ObjectOutputStream(doctorOut);               
               out.writeObject(tempDoctor);
               out.close();
               doctorOut.close();

           }catch(IOException i){
               i.printStackTrace();
           }           

           response.sendRedirect("createUser.jsp");
           
        }
        
        if(userID.startsWith("P"))
        {
           ArrayList<Patient> tempPatient = new ArrayList<Patient>();
           
            try
            {
                FileInputStream filePatientIn = new FileInputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\patient.ser");
                ObjectInputStream patientObjIn = new ObjectInputStream(filePatientIn);
                tempPatient = (ArrayList<Patient>) patientObjIn.readObject();
                
                patientObjIn.close();
                filePatientIn.close();
            }
            catch(IOException | ClassNotFoundException e)
            {
                
            }
           
            for(int i = 0; i < tempPatient.size(); i++)
            {
                System.out.print(tempPatient.get(i).getFirstName());
            }           
           
           tempPatient.add(new Patient(userID, password, firstName, surname, address, gender, dob, finalAge, accountStatus));

           try
           {
               FileOutputStream patientOut = new FileOutputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\patient.ser");
               ObjectOutputStream out = new ObjectOutputStream(patientOut);
               out.writeObject(tempPatient);
               out.close();
               patientOut.close();

           }catch(IOException i){
               i.printStackTrace();
           }           

           response.sendRedirect("createUser.jsp");
        }
        
        if(userID.startsWith("S"))
        {
           ArrayList<Secretary> tempSecretary = new ArrayList<Secretary>();
           
            try
            {
                FileInputStream filePatientIn = new FileInputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\secretary.ser");
                ObjectInputStream patientObjIn = new ObjectInputStream(filePatientIn);
                tempSecretary = (ArrayList<Secretary>) patientObjIn.readObject();
                
                patientObjIn.close();
                filePatientIn.close();
            }
            catch(IOException | ClassNotFoundException e)
            {
                
            }
           
            for(int i = 0; i < tempSecretary.size(); i++)
            {
                System.out.print(tempSecretary.get(i).getFirstName());
            }
            
           //ArrayList<Admin>writeAdmin = new ArrayList<Admin>();
           
           tempSecretary.add(new Secretary(userID, password, firstName, surname, address, gender, dob, finalAge));

           try
           {
               FileOutputStream patientOut = new FileOutputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\secretary.ser");
               ObjectOutputStream out = new ObjectOutputStream(patientOut);
               out.writeObject(tempSecretary);
               out.close();
               patientOut.close();

           }catch(IOException i){
               i.printStackTrace();
           }           

           response.sendRedirect("createUser.jsp");
        }
    }
}
