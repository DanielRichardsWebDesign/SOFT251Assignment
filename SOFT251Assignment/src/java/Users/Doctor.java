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
    public String id;
    public String firstName;
    public String lastName;
    public String password;
    public String address;
    public String sex;
    public String dob;
    public int age;
    public int score;

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
        
        FileInputStream fileDoctorIn = new FileInputStream("doctor.ser");
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
    
    public ArrayList<Doctor> serialize() throws FileNotFoundException, IOException{
        ArrayList<Doctor> writeDoctor = new ArrayList();
        
        try
        {
            FileOutputStream doctorOut = new FileOutputStream("doctor.ser");
            ObjectOutputStream out = new ObjectOutputStream(doctorOut);               
            out.writeObject(writeDoctor);
            out.close();
            doctorOut.close();
        }
        catch(IOException e)
        {
            
        }
        return writeDoctor;
    }
    
    public void removeDoctor() throws IOException{
        Doctor doctor = new Doctor();
        ArrayList<Doctor> removeDoctor = new ArrayList<Doctor>();  
        removeDoctor = doctor.deserialize();       
        
        for(int i = 0; i < removeDoctor.size(); i++)
        {
            String removeDoctorID = removeDoctor.get(i).getId();
            
            if(removeDoctorID.contains(removeDoctorID))
            {
                removeDoctor.remove(i);
                removeDoctor = doctor.serialize();
            }
        }       
    }
}
