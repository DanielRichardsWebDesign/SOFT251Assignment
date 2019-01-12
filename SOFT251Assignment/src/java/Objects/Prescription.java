/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import Users.Doctor;
import Users.Patient;

/**
 *
 * @author Daniel Richards
 */
public class Prescription implements java.io.Serializable {
    
    private Patient patient;
    private Doctor doctor;
    private Medicine medicine;
    private int qty;
    private String dosage;

    public Prescription(Patient patient, Doctor doctor, Medicine medicine, int qty, String dosage) {
        this.patient = patient;
        this.doctor = doctor;
        this.medicine = medicine;
        this.qty = qty;
        this.dosage = dosage;
    }
    
    public Prescription(){
        
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

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    
}
