/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import Users.Doctor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Daniel Richards
 */
public class Medicine implements java.io.Serializable {
    String medicineID;
    String medicineName;
    int quantity;

    /**
     *
     * @param medicineID
     * @param medicineName
     * @param quantity
     */
    public Medicine(String medicineID, String medicineName, int quantity) {
        this.medicineID = medicineID;
        this.medicineName = medicineName;
        this.quantity = quantity;
    }
    
    /**
     *
     */
    public Medicine(){
        
    }

    /**
     *
     * @return
     */
    public String getMedicineID() {
        return medicineID;
    }

    /**
     *
     * @param medicineID
     */
    public void setMedicineID(String medicineID) {
        this.medicineID = medicineID;
    }

    /**
     *
     * @return
     */
    public String getMedicineName() {
        return medicineName;
    }

    /**
     *
     * @param medicineName
     */
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    /**
     *
     * @return
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    /**
     *
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public ArrayList<Medicine> deserialize() throws FileNotFoundException, IOException{
        ArrayList<Medicine> readMedicine = new ArrayList();
        try
        {
        
        FileInputStream fileMedicineIn = new FileInputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\doctor.ser");
        ObjectInputStream medicineObjIn = new ObjectInputStream(fileMedicineIn);
        readMedicine = (ArrayList<Medicine>)medicineObjIn.readObject();
        
        medicineObjIn.close();
        fileMedicineIn.close();
        }
        catch(IOException | ClassNotFoundException e)
        {
            
        }
        return readMedicine;
    }
    
    /**
     *
     * @param doctorList
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void serialize(ArrayList<Doctor> doctorList) throws FileNotFoundException, IOException{
                                
        try
        {
            FileOutputStream doctorOut = new FileOutputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\doctor.ser");
            ObjectOutputStream out = new ObjectOutputStream(doctorOut);               
            out.writeObject(doctorList);
            out.close();
            doctorOut.close();
        }
        catch(IOException e)
        {
            
        }
    }
}
