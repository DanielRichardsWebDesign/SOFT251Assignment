/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;
import java.io.FileInputStream;
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
    
    public String id;
    public String password;
    public String firstName;
    public String lastName;    
    public String address;
    public String sex;
    public String dob;
    public int age;
    
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
    
    public void deserialize(){
        ArrayList<Admin> tempAdmins = new ArrayList<Admin>();           
            try
            {
                FileInputStream fileAdminIn = new FileInputStream("C:\\Users/Daniel Richards/Documents/admin.ser");
                ObjectInputStream adminObjIn = new ObjectInputStream(fileAdminIn);
                tempAdmins = (ArrayList<Admin>) adminObjIn.readObject();
                
                adminObjIn.close();
                fileAdminIn.close();
            }
            catch(IOException | ClassNotFoundException e)
            {
                
            }
           
            for(int i = 0; i < tempAdmins.size(); i++)
            {
                System.out.print(tempAdmins.get(i).getFirstName());
            }
    }
    
//    public void serialize(){
//        ArrayList<Admin>writeAdmin = new ArrayList<Admin>();
//           
//           writeAdmin.add(new Admin(userID, password, firstName, surname, address, gender, dob, finalAge));
//
//           try
//           {
//               FileOutputStream adminOut = new FileOutputStream("C:\\Users/Daniel Richards/Documents/admin.ser", true);
//               ObjectOutputStream out = new ObjectOutputStream(adminOut);
//               out.writeObject(writeAdmin);
//               out.close();
//               adminOut.close();
//
//           }catch(IOException i){
//               i.printStackTrace();
//           }           
//    }
            
    public void approveAccountRequest(){
        
    }
    
    
}
