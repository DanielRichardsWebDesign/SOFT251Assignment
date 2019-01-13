/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author Daniel Richards
 */
public class Medicine implements java.io.Serializable {
    public String medicineID;
    public String medicineName;
    public int quantity;

    public Medicine(String medicineID, String medicineName, int quantity) {
        this.medicineID = medicineID;
        this.medicineName = medicineName;
        this.quantity = quantity;
    }
    
    public Medicine(){
        
    }

    public String getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(String medicineID) {
        this.medicineID = medicineID;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }       
}
