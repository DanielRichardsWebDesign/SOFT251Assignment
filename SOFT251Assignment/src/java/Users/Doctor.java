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
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Daniel Richards
 */
public class Doctor extends User implements Serializable {
    String id;
    String firstName;
    String lastName;
    String password;
    String address;
    String sex;
    String dob;
    int age;
    int scoreTotal = 0;
    int scoreCount; 

    public Doctor(String id, String firstName, String lastName, String password, String address, String sex, String dob, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
        this.sex = sex;
        this.dob = dob;
        this.age = age;
    }
    
    public Doctor(){
        
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

    public ArrayList<Doctor> deserialize() throws FileNotFoundException, IOException{
        ArrayList<Doctor> readDoctor = new ArrayList();
        try
        {
        
        FileInputStream fileDoctorIn = new FileInputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\doctor.ser");
        ObjectInputStream doctorObjIn = new ObjectInputStream(fileDoctorIn);
        readDoctor = (ArrayList<Doctor>)doctorObjIn.readObject();
        
        doctorObjIn.close();
        fileDoctorIn.close();
        }
        catch(IOException | ClassNotFoundException e)
        {
            
        }
        return readDoctor;
    }
    
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
    
    public double calculateRating(){
        double doctorRating = (double) this.scoreTotal / (double) this.scoreCount;
        
        return doctorRating;
    } 
}
