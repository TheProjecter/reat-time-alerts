/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pojo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author priyankgandhi
 */
public class UserTest {

    public UserTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getUser_id method, of class User.
     */
    @Test
    public void getUser_id() {
        System.out.println("getUser_id");
        User instance = new User();
        int[] expResult = null;
        int[] result = instance.getUser_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser_id method, of class User.
     */
    @Test
    public void setUser_id() {
        System.out.println("setUser_id");
        int[] user_id = null;
        User instance = new User();
        instance.setUser_id(user_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessenger_id method, of class User.
     */
    @Test
    public void getMessenger_id() {
        System.out.println("getMessenger_id");
        User instance = new User();
        String[] expResult = null;
        String[] result = instance.getMessenger_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessenger_id method, of class User.
     */
    @Test
    public void setMessenger_id() {
        System.out.println("setMessenger_id");
        String[] messenger_id = null;
        User instance = new User();
        instance.setMessenger_id(messenger_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKid method, of class User.
     */
    @Test
    public void getKid() {
        System.out.println("getKid");
        User instance = new User();
        int expResult = 0;
        int result = instance.getKid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKid method, of class User.
     */
    @Test
    public void setKid() {
        System.out.println("setKid");
        int kid = 0;
        User instance = new User();
        instance.setKid(kid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}