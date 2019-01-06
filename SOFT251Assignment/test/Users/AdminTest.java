/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Richards
 */
public class AdminTest {
    
    public AdminTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getId method, of class Admin.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Admin instance = new Admin();
        String expResult = "A123";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Admin.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "A123";
        Admin instance = new Admin();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Admin.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Admin instance = new Admin();
        String expResult = "James";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Admin.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "James";
        Admin instance = new Admin();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Admin.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Admin instance = new Admin();
        String expResult = "Smith";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Admin.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "Smith";
        Admin instance = new Admin();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Admin.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Admin instance = new Admin();
        String expResult = "password";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Admin.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "password";
        Admin instance = new Admin();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Admin.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Admin instance = new Admin();
        String expResult = "3 Priory Mill, Plympton, Plymouth, PL7 1WR";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Admin.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "3 Priory Mill, Plympton, Plymouth, PL7 1WR";
        Admin instance = new Admin();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSex method, of class Admin.
     */
    @Test
    public void testGetSex() {
        System.out.println("getSex");
        Admin instance = new Admin();
        String expResult = "Male";
        String result = instance.getSex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSex method, of class Admin.
     */
    @Test
    public void testSetSex() {
        System.out.println("setSex");
        String sex = "Male";
        Admin instance = new Admin();
        instance.setSex(sex);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDob method, of class Admin.
     */
    @Test
    public void testGetDob() {
        System.out.println("getDob");
        Admin instance = new Admin();
        String expResult = "22/1/1999";
        String result = instance.getDob();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDob method, of class Admin.
     */
    @Test
    public void testSetDob() {
        System.out.println("setDob");
        String dob = "22/1/1999";
        Admin instance = new Admin();
        instance.setDob(dob);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Admin.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Admin instance = new Admin();
        int expResult = 25;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Admin.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 25;
        Admin instance = new Admin();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
