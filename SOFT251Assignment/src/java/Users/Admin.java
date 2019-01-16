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
public class Admin extends User implements java.io.Serializable {
    
    /**
     *id
     */
    public String id;

    /**
     *password
     */
    public String password;

    /**
     *firstName
     */
    public String firstName;

    /**
     *lastName
     */
    public String lastName;    

    /**
     *address
     */
    public String address;

    /**
     *sex
     */
    public String sex;

    /**
     *dob
     */
    public String dob;

    /**
     *age
     */
    public int age;
    
    /**
     *
     * @param id
     * @param password
     * @param firstName
     * @param lastName
     * @param address
     * @param sex
     * @param dob
     * @param age
     */
    public Admin(String id, String password, String firstName, String lastName, String address, String sex, String dob, int age) {
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;        
        this.address = address;
        this.sex = sex;
        this.dob = dob;
        this.age = age;
    }

    /**
     *  
     */
    public Admin(){
        
    }

    /**
     *
     * @return id;
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
     * @return firstName
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
     * @return lastName
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
     * @return password;
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password;
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return address;
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
     * @return sex;
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
     * @return dob;
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
     * @return age;
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

    @Override
    public String toString() {
        return "Admin{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password + ", address=" + address + ", sex=" + sex + ", dob=" + dob + ", age=" + age + '}';
    }
    
    /**
     * Deserialize objects from admin.ser file
     * @param the admin arraylist
     * @return admin arraylist of objects
     */
    public ArrayList<Admin> deserialize() throws FileNotFoundException, IOException{
        ArrayList<Admin> readAdmin = new ArrayList();
        try
        {
        
        FileInputStream fileAdminIn = new FileInputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\admin.ser");
        ObjectInputStream adminObjIn = new ObjectInputStream(fileAdminIn);
        readAdmin = (ArrayList<Admin>)adminObjIn.readObject();
        
        adminObjIn.close();
        fileAdminIn.close();
        }
        catch(IOException | ClassNotFoundException e)
        {
            
        }
        
        if(readAdmin == null || readAdmin.isEmpty()){
            return null;
        }else{
        return readAdmin;
        }
    }
    /**
     * Serialize objects to admin.ser file
     * @param the admin arraylist
     * @param output file
     */
    public void serialize(ArrayList<Admin> adminList) throws FileNotFoundException, IOException{
                                
        try
        {
            FileOutputStream adminOut = new FileOutputStream("C:\\Users\\Daniel Richards\\Desktop\\serialise\\admin.ser");
            ObjectOutputStream out = new ObjectOutputStream(adminOut);               
            out.writeObject(adminList);
            out.close();
            adminOut.close();
        }
        catch(IOException e)
        {
            
        }
    }
            
    /**
     *
     */
    public void approveAccountRequest(){
        
    }   
    
}
