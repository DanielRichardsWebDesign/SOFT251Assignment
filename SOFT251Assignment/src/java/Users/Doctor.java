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
    double doctorScore;
    double doctorReviewAmount;
    double rating;
    
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
     * @param doctorScore
     * @param doctorReviewAmount
     * @param rating
     */
    public Doctor(String id, String firstName, String lastName, String password, String address, String sex, String dob, int age, double doctorScore, double doctorReviewAmount, double rating) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
        this.sex = sex;
        this.dob = dob;
        this.age = age;
        this.doctorScore = doctorScore;
        this.doctorReviewAmount = doctorReviewAmount;
        this.rating = rating;        
    }
   
    /**
     *
     * @return
     */
    public double getDoctorReviewAmount() {
        return doctorReviewAmount;
    }

    /**
     *
     * @param doctorReviewAmount
     */
    public void setDoctorReviewAmount(double doctorReviewAmount) {
        this.doctorReviewAmount = doctorReviewAmount;
    }
    
    /**
     *
     */
    public Doctor(){
        
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
     */
    public double getDoctorScore() {
        return doctorScore;
    }

    /**
     *
     * @param doctorScore
     */
    public void setDoctorScore(double doctorScore) {
        this.doctorScore = doctorScore;
    }
    
    /**
     *
     * @return
     */
    public double getRating(){
        return rating;
    }
    
    /**
     *
     * @param rating
     */
    public void setRating(double rating){
        this.rating = rating;
    }

    /**
     *
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
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
        
        if(readDoctor == null || readDoctor.isEmpty()){
            return null;
        }else{
        return readDoctor;
        }
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
            FileOutputStream doctorOut = new FileOutputStream("doctor.ser");
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
