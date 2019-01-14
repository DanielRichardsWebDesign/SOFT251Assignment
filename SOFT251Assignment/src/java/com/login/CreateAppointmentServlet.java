///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.login;
//
//import Users.Doctor;
//import Users.Patient;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// *
// * @author Daniel Richards
// */
//public class CreateAppointmentServlet extends HttpServlet {
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//   
//
//    
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String appointmentID = request.getParameter("ID");
//        String appointmentDate = request.getParameter("date");
//        String appointmentTime = request.getParameter("time");
//        String doctorID = request.getParameter("doctorID");
//        String patientID = request.getParameter("patientID");
//        
//        Patient patient = new Patient();
//        ArrayList<Patient> readPatient = new ArrayList<Patient>();
//        readPatient = patient.deserialize();
//        
//        for(int i = 0; i < readPatient.size(); i++)
//        {
//            String readPatientID = readPatient.get(i).getId();
//            
//            if(patientID.equals(readPatientID)){
//                Doctor doctor = new Doctor();
//                ArrayList<Doctor> readDoctor = new ArrayList<Doctor>();
//                readDoctor = doctor.deserialize();
//                
//                for(int d = 0; d < readDoctor.size(); d++)
//                {
//                    String readP
//                }
//            }
//        }
//        
//    }
//}
