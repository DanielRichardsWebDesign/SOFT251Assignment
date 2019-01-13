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
public class Secretary extends User implements java.io.Serializable {
    public String id;
    public String firstName;
    public String lastName;
    public String password;
    public String address;
    public String sex;
    public String dob;
    public int age;

    public Secretary(String id, String firstName, String lastName, String password, String address, String sex, String dob, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
        this.sex = sex;
        this.dob = dob;
        this.age = age;
    }
    
    public Secretary(){
        
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
    
    public ArrayList<Secretary> deserialize() throws FileNotFoundException, IOException{
        ArrayList<Secretary> readSecretary = new ArrayList();
        try
        {
        
        FileInputStream fileSecretaryIn = new FileInputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\doctor.ser");
        ObjectInputStream secretaryObjIn = new ObjectInputStream(fileSecretaryIn);
        readSecretary = (ArrayList<Secretary>)secretaryObjIn.readObject();
        
        secretaryObjIn.close();
        fileSecretaryIn.close();
        }
        catch(IOException | ClassNotFoundException e)
        {
            
        }
        return readSecretary;
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
    
    
    
    
    
}
