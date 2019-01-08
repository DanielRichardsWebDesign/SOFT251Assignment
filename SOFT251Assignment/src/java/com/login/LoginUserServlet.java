/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import Users.Admin;
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
                FileInputStream fileAdminIn = new FileInputStream("C:\\Users/Daniel Richards/Documents/admin.ser");
                ObjectInputStream adminObjIn = new ObjectInputStream(fileAdminIn);
                checkAdmins = (ArrayList<Admin>) adminObjIn.readObject();
                
                adminObjIn.close();
                fileAdminIn.close();
              }
              catch(IOException | ClassNotFoundException e)
              {
                  
              }
              
              for(int i = 0; i < checkAdmins.size(); i++)
              {
                  String idCheck = checkAdmins.get(i).getId();
                  String passCheck = checkAdmins.get(i).getPassword();
                  
                  if(idCheck.equals(userID) && passCheck.equals(userPass))
                  {
                     response.sendRedirect("dashboard.jsp");
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
              
//              if(checkAdmins.contains(userID))
//              {
//                  HttpSession adminSession = request.getSession();
//                  adminSession.setAttribute("adminID", userID);
//                  
//                  response.sendRedirect("dashboard.jsp");
//              }
//              else
//              {
//                  response.sendRedirect("login.jsp");
//              }                   
                  
        }
    
}
    

}
