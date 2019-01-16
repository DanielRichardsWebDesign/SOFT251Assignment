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

    /**
     *
     * @param patient
     * @param doctor
     * @param medicine
     * @param qty
     * @param dosage
     */
    public Prescription(Patient patient, Doctor doctor, Medicine medicine, int qty, String dosage) {
        this.patient = patient;
        this.doctor = doctor;
        this.medicine = medicine;
        this.qty = qty;
        this.dosage = dosage;
    }
    
    /**
     *
     */
    public Prescription(){
        
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
    public Medicine getMedicine() {
        return medicine;
    }

    /**
     *
     * @param medicine
     */
    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    /**
     *
     * @return
     */
    public int getQty() {
        return qty;
    }

    /**
     *
     * @param qty
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     *
     * @return
     */
    public String getDosage() {
        return dosage;
    }

    /**
     *
     * @param dosage
     */
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    
}
