/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import Objects.Medicine;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daniel Richards
 */
@WebServlet(name = "CreateMedicineServlet", urlPatterns = {"/CreateMedicineServlet"})
public class CreateMedicineServlet extends HttpServlet {

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
        
        String medicineID = request.getParameter("medicineID");
        String medicineName = request.getParameter("medicineName");
        String medicineQty = request.getParameter("medicineQty");
        int finalQty = Integer.parseInt(medicineQty);
        
        ArrayList<Medicine> tempMed = new ArrayList<Medicine>();
           
            try
            {
                FileInputStream fileMedicineIn = new FileInputStream("C:\\Users/Daniel Richards/Documents/medicine.ser");
                ObjectInputStream medicineObjIn = new ObjectInputStream(fileMedicineIn);
                tempMed = (ArrayList<Medicine>) medicineObjIn.readObject();
                
                medicineObjIn.close();
                fileMedicineIn.close();
            }
            catch(IOException | ClassNotFoundException e)
            {
                
            }
           
            for(int i = 0; i < tempMed.size(); i++)
            {
                System.out.print(tempMed.get(i).getMedicineName());
            }
            
           ArrayList<Medicine>writeMed = new ArrayList<Medicine>();
           
           writeMed.add(new Medicine(medicineID, medicineName, finalQty));

           try
           {
               FileOutputStream medOut = new FileOutputStream("C:\\Users/Daniel Richards/Documents/medicine.ser", true);
               ObjectOutputStream out = new ObjectOutputStream(medOut);
               out.writeObject(writeMed);
               out.close();
               medOut.close();

           }catch(IOException i){
               i.printStackTrace();
           }           

           response.sendRedirect("createMedicine.jsp");
        }
    }

