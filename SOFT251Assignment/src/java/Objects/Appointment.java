/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import Users.Doctor;
import Users.Patient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Daniel Richards
 */
public class Appointment {
    private String appointmentID;
    private Date appointmentDate;
    private String appointmentTime;
    private Patient patient;
    private Doctor doctor;
    private boolean appointmentApproved;
    
    /**
     *
     * @param appointmentID
     * @param appointmentDate
     * @param appointmentTime
     * @param patient
     * @param doctor
     * @param appointmentApproved
     */
    public Appointment(String appointmentID, Date appointmentDate, String appointmentTime, Patient patient, Doctor doctor, boolean appointmentApproved) {
        this.appointmentID = appointmentID;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentApproved = appointmentApproved;
    }

    /**
     *
     */
    public Appointment(){
        
    }

    /**
     *
     * @return
     */
    public String getAppointmentID() {
        return appointmentID;
    }

    /**
     *
     * @param appointmentID
     */
    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }

    /**
     *
     * @return
     */
    public String getAppointmentTime() {
        return appointmentTime;
    }

    /**
     *
     * @param appointmentTime
     */
    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    /**
     *
     * @return
     */
    public Date getAppointmentDate() {
        return appointmentDate;
    }

    /**
     *
     * @param appointmentDate
     */
    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    /**
     *
     * @return
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     *
     * @param patient
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     *
     * @return
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     *
     * @param doctor
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     *
     * @return
     */
    public boolean isAppointmentApproved() {
        return appointmentApproved;
    }

    /**
     *
     * @param appointmentApproved
     */
    public void setAppointmentApproved(boolean appointmentApproved) {
        this.appointmentApproved = appointmentApproved;
    }
    
    /**
     *
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public ArrayList<Appointment> deserialize() throws FileNotFoundException, IOException{
        ArrayList<Appointment> readAppointment = new ArrayList();
        try
        {
        
        FileInputStream fileAppointmentIn = new FileInputStream("appointment.ser");
        ObjectInputStream appointmentObjIn = new ObjectInputStream(fileAppointmentIn);
        readAppointment = (ArrayList<Appointment>)appointmentObjIn.readObject();
        
        appointmentObjIn.close();
        fileAppointmentIn.close();
        }
        catch(IOException | ClassNotFoundException e)
        {
            
        }
        return readAppointment;
    }
    
    /**
     *
     * @param appointmentList
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void serialize(ArrayList<Appointment> appointmentList) throws FileNotFoundException, IOException{
                                
        try
        {
            FileOutputStream appointmentOut = new FileOutputStream("appointment.ser");
            ObjectOutputStream out = new ObjectOutputStream(appointmentOut);               
            out.writeObject(appointmentList);
            out.close();
            appointmentOut.close();
        }
        catch(IOException e)
        {
            
        }
    }
}
