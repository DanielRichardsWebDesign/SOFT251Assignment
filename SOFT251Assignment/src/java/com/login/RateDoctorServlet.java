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
public class RateDoctorServlet extends HttpServlet {

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
        String doctorScore = request.getParameter("doctorScore");
        Double finalDoctorScore = Double.parseDouble(doctorScore);
        
        Doctor doctor = new Doctor();
        ArrayList<Doctor> readDoctor = new ArrayList<Doctor>();
        readDoctor = doctor.deserialize(); 
        
        for(int i = 0; i < readDoctor.size(); i++)
        {
            String readDoctorID = readDoctor.get(i).getId();
            Double readDoctorScore = readDoctor.get(i).getDoctorScore();
            Double readDoctorReviewAmount = readDoctor.get(i).getDoctorReviewAmount();
                                    
            if(doctorID.equals(readDoctorID))
            {
                Double newDoctorScore = readDoctorScore + finalDoctorScore;
                Double newDoctorReviewAmount = readDoctorReviewAmount + 1;
                Double newDoctorRating = newDoctorScore / newDoctorReviewAmount;
                
                readDoctor.get(i).setDoctorScore(newDoctorScore);
                readDoctor.get(i).setDoctorReviewAmount(newDoctorReviewAmount);
                readDoctor.get(i).setRating(newDoctorRating);
                
                doctor.serialize(readDoctor);
                response.sendRedirect("rateDoctor.jsp");
                
                System.out.println("Rating: " + readDoctor.get(i).getRating());
                System.out.println("Total Points: " + readDoctor.get(i).getRating());
                System.out.println("Amount Reviewed: " + readDoctor.get(i).getRating());                           
            }
        }
    }
}
