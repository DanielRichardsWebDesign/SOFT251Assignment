/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import Users.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Daniel Richards
 */
@WebServlet(name = "LoginUserServlet", urlPatterns = {"/LoginUserServlet"})
public class LoginUserServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String userID = request.getParameter("userID");
        String userPass = request.getParameter("userPass");
        
        if(userID.startsWith("A"))
        {
              ArrayList<Admin> checkAdmins = new ArrayList<Admin>();
              
              try
              {
                FileInputStream fileAdminIn = new FileInputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\admin.ser");
                ObjectInputStream adminObjIn = new ObjectInputStream(fileAdminIn);
                checkAdmins = (ArrayList<Admin>) adminObjIn.readObject();
                
                adminObjIn.close();
                fileAdminIn.close();
              }
              catch(IOException | ClassNotFoundException e)
              {
                  
              }
              
              System.out.println("userId" + userID);
              System.out.println(checkAdmins.size());
              
              for(int i = 0; i < checkAdmins.size(); i++)
              {
                  String idCheck = checkAdmins.get(i).getId();
                  String passCheck = checkAdmins.get(i).getPassword();
                  System.out.println("idCheck " + idCheck);
                  System.out.println("passCheck " + passCheck);
                  
                  if(idCheck.equals(userID) && passCheck.equals(userPass))
                  {
                     response.sendRedirect("adminDashboard.jsp");
                     HttpSession adminSession = request.getSession();
                     adminSession.setAttribute("adminID", userID);
                     
                     System.out.println("IN");
                  }
                  else
                  {
                      System.out.println("Login unsuccessful");
                      System.out.println("OUT");
                  }
                  
              }
        }
              
          if(userID.startsWith("P")){

              ArrayList<Patient> checkPatients = new ArrayList<Patient>();

              try
              {
                FileInputStream filePatientIn = new FileInputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\patient.ser");
                ObjectInputStream patientObjIn = new ObjectInputStream(filePatientIn);
                checkPatients = (ArrayList<Patient>) patientObjIn.readObject();

                patientObjIn.close();
                filePatientIn.close();
              }
              catch(IOException | ClassNotFoundException e)
              {

              }

              System.out.println("userId" + userID);
              System.out.println(checkPatients.size());

              for(int i = 0; i < checkPatients.size(); i++)
              {
                  String idCheck = checkPatients.get(i).getId();
                  String passCheck = checkPatients.get(i).getPassword();
                  System.out.println("idCheck " + idCheck);
                  System.out.println("passCheck " + passCheck);

                  if(idCheck.equals(userID) && passCheck.equals(userPass))
                  {
                     response.sendRedirect("patientDashboard.jsp");
                     HttpSession adminSession = request.getSession();
                     adminSession.setAttribute("patientID", userID);

                     System.out.println("IN");
                  }
                  else
                  {
                      System.out.println("Login unsuccessful");
                      System.out.println("OUT");
                  }
              }                  
        }
          
        if(userID.startsWith("S")){
            ArrayList<Secretary> checkSecretaries = new ArrayList<Secretary>();

              try
              {
                FileInputStream fileSecretaryIn = new FileInputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\secretary.ser");
                ObjectInputStream secretaryObjIn = new ObjectInputStream(fileSecretaryIn);
                checkSecretaries = (ArrayList<Secretary>) secretaryObjIn.readObject();

                secretaryObjIn.close();
                fileSecretaryIn.close();
              }
              catch(IOException | ClassNotFoundException e)
              {

              }

              System.out.println("userId" + userID);
              System.out.println(checkSecretaries.size());

              for(int i = 0; i < checkSecretaries.size(); i++)
              {
                  String idCheck = checkSecretaries.get(i).getId();
                  String passCheck = checkSecretaries.get(i).getPassword();
                  System.out.println("idCheck " + idCheck);
                  System.out.println("passCheck " + passCheck);

                  if(idCheck.equals(userID) && passCheck.equals(userPass))
                  {
                     response.sendRedirect("secretaryDashboard.jsp");
                     HttpSession adminSession = request.getSession();
                     adminSession.setAttribute("secretaryID", userID);

                     System.out.println("IN");
                  }
                  else
                  {
                      System.out.println("Login unsuccessful");
                      System.out.println("OUT");
                  }
              }
        }
        
        if(userID.startsWith("D")){
            ArrayList<Doctor> checkDoctors = new ArrayList<Doctor>();

              try
              {
                FileInputStream fileDoctorIn = new FileInputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\doctor.ser");
                ObjectInputStream doctorObjIn = new ObjectInputStream(fileDoctorIn);
                checkDoctors = (ArrayList<Doctor>) doctorObjIn.readObject();

                doctorObjIn.close();
                fileDoctorIn.close();
              }
              catch(IOException | ClassNotFoundException e)
              {

              }

              System.out.println("userId" + userID);
              System.out.println(checkDoctors.size());

              for(int i = 0; i < checkDoctors.size(); i++)
              {
                  String idCheck = checkDoctors.get(i).getId();
                  String passCheck = checkDoctors.get(i).getPassword();
                  System.out.println("idCheck " + idCheck);
                  System.out.println("passCheck " + passCheck);

                  if(idCheck.equals(userID) && passCheck.equals(userPass))
                  {
                     response.sendRedirect("doctorDashboard.jsp");
                     HttpSession adminSession = request.getSession();
                     adminSession.setAttribute("doctorID", userID);

                     System.out.println("IN");
                  }
                  else
                  {
                      System.out.println("Login unsuccessful");
                      System.out.println("OUT");
                  }
              }
        }  
        
        
    }
    
}
    


