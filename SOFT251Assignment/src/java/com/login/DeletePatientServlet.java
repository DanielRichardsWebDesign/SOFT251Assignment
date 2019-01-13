/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import Users.Patient;
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
public class DeletePatientServlet extends HttpServlet {

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
        
        String patientID = request.getParameter("patientID");
        
        Patient patient = new Patient();
        ArrayList<Patient> readPatient = new ArrayList<Patient>();
        readPatient = patient.deserialize(); 
        
        for(int i = 0; i < readPatient.size(); i++)
        {
            String readPatientID = readPatient.get(i).getId();
            
            if(patientID.equals(readPatientID)){
                readPatient.remove(i);
                
                patient.serialize(readPatient);
                response.sendRedirect("removePatient.jsp");
                break;
            }
            
        }
    }    
}
