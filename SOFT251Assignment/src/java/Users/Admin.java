/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;
import java.util.ArrayList;

/**
 *
 * @author Daniel Richards
 */
public class Admin extends User implements java.io.Serializable {
    
    public String id;
    public String firstName;
    public String lastName;
    public String password;
    public String address;
    public String sex;
    public String dob;
    public int age;
    
    public Admin(String id, String firstName, String lastName, String password, String address, String sex, String dob, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
        this.sex = sex;
        this.dob = dob;
        this.age = age;
    }

    public Admin(){
        
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

    @Override
    public String toString() {
        return "Admin{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password + ", address=" + address + ", sex=" + sex + ", dob=" + dob + ", age=" + age + '}';
    }
    
    public void serialize(){
        
    }
            
    public void approveAccountRequest(){
        
    }
    
    
}
