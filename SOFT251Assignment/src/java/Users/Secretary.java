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

    /**
     *
     */
    public String id;

    /**
     *
     */
    public String firstName;

    /**
     *
     */
    public String lastName;

    /**
     *
     */
    public String password;

    /**
     *
     */
    public String address;

    /**
     *
     */
    public String sex;

    /**
     *
     */
    public String dob;

    /**
     *
     */
    public int age;

    /**
     *
     * @param id
     * @param firstName
     * @param lastName
     * @param password
     * @param address
     * @param sex
     * @param dob
     * @param age
     */
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
    
    /**
     *
     */
    public Secretary(){
        
    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     */
    public String getSex() {
        return sex;
    }

    /**
     *
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     *
     * @return
     */
    public String getDob() {
        return dob;
    }

    /**
     *
     * @param dob
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     *
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public ArrayList<Secretary> deserialize() throws FileNotFoundException, IOException{
        ArrayList<Secretary> readSecretary = new ArrayList();
        try
        {
        
        FileInputStream fileSecretaryIn = new FileInputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\secretary.ser");
        ObjectInputStream secretaryObjIn = new ObjectInputStream(fileSecretaryIn);
        readSecretary = (ArrayList<Secretary>)secretaryObjIn.readObject();
        
        secretaryObjIn.close();
        fileSecretaryIn.close();
        }
        catch(IOException | ClassNotFoundException e)
        {
            
        }
        
        if(readSecretary == null || readSecretary.isEmpty()){
            return null;
        }else{
        return readSecretary;
        }
    }
    
    /**
     *
     * @param secretaryList
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void serialize(ArrayList<Secretary> secretaryList) throws FileNotFoundException, IOException{
                                
        try
        {
            FileOutputStream secretaryOut = new FileOutputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\secretary.ser");
            ObjectOutputStream out = new ObjectOutputStream(secretaryOut);               
            out.writeObject(secretaryList);
            out.close();
            secretaryOut.close();
        }
        catch(IOException e)
        {
            
        }
    }
}
