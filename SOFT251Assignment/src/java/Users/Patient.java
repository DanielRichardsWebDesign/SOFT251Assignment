/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

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
public class Patient extends User implements java.io.Serializable {
    public String id;
    public String firstName;
    public String lastName;
    public String password;
    public String address;
    public String sex;
    public String dob;
    public int age;
    public boolean accountStatus;

    public Patient(String id, String firstName, String lastName, String password, String address, String sex, String dob, int age, boolean accountStatus) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
        this.sex = sex;
        this.dob = dob;
        this.age = age;
        this.accountStatus = false;
    }
    
    public Patient(){
        
    }
      
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public boolean setAccountStatus(boolean accountStatus){
        if(accountStatus == false){
            return false;
        }
        return true;
    }
    
    public ArrayList<Patient> deserialize() throws FileNotFoundException, IOException{
        ArrayList<Patient> readPatient = new ArrayList();
        try
        {
        
        FileInputStream filePatientIn = new FileInputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\patient.ser");
        ObjectInputStream patientObjIn = new ObjectInputStream(filePatientIn);
        readPatient = (ArrayList<Patient>)patientObjIn.readObject();
        
        patientObjIn.close();
        filePatientIn.close();
        }
        catch(IOException | ClassNotFoundException e)
        {
            
        }
       
        return readPatient;
    }
    
    public void serialize(ArrayList<Patient> patientList) throws FileNotFoundException, IOException{
                                
        try
        {
            FileOutputStream patientOut = new FileOutputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\patient.ser");
            ObjectOutputStream out = new ObjectOutputStream(patientOut);               
            out.writeObject(patientList);
            out.close();
            patientOut.close();
        }
        catch(IOException e)
        {
            
        }
    }
    
    
}
