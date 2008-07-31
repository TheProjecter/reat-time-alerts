/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataaccess;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.User;

/**
 *
 * @author priyankgandhi
 */
public class pluginQueriesTest {

    public pluginQueriesTest() {
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
     * Test of checkTimeStamp method, of class pluginQueries.
     */
    @Test
    public void checkTimeStamp() {
        System.out.println("checkTimeStamp");
        pluginQueries instance = new pluginQueries();
        int[] expResult = null;
        int[] result = instance.checkTimeStamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserInfo method, of class pluginQueries.
     */
    @Test
    public void getUserInfo() {
        System.out.println("getUserInfo");
        int kid = 1;
        pluginQueries instance = new pluginQueries();
        User expResult = null;
        User result = instance.getUserInfo(kid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKeywordFromKid method, of class pluginQueries.
     */
    @Test
    public void getKeywordFromKid() {
        System.out.println("getKeywordFromKid");
        int kid = 1;
        pluginQueries instance = new pluginQueries();
        String expResult = "RSA";
        String result = instance.getKeywordFromKid(kid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}