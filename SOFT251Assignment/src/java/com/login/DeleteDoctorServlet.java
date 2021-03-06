/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import Users.Doctor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daniel Richards
 */
public class DeleteDoctorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String doctorID = request.getParameter("doctorID");
        
        Doctor doctor = new Doctor();
        ArrayList<Doctor> readDoctor = new ArrayList<Doctor>();
        readDoctor = doctor.deserialize(); 
        
        for(int i = 0; i < readDoctor.size(); i++)
        {
            String readDoctorID = readDoctor.get(i).getId();
            
            if(doctorID.equals(readDoctorID)){
                readDoctor.remove(i);
                
                doctor.serialize(readDoctor);
                response.sendRedirect("removeDoctors&Secretaries.jsp");
                break;
            }
            
        }
    }
}
