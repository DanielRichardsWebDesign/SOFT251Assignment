/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import Users.Doctor;
import Users.Patient;
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

    public Appointment(String appointmentID, Date appointmentDate, String appointmentTime, Patient patient, Doctor doctor, boolean appointmentApproved) {
        this.appointmentID = appointmentID;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentApproved = appointmentApproved;
    }

    public Appointment(){
        
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public boolean isAppointmentApproved() {
        return appointmentApproved;
    }

    public void setAppointmentApproved(boolean appointmentApproved) {
        this.appointmentApproved = appointmentApproved;
    }
}
