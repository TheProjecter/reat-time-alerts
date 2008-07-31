/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypkg;

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
public class YahooClientTest {

    public YahooClientTest() {
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
     * Test of logout method, of class YahooClient.
     */
    @Test
    public void logout() {
        System.out.println("logout");
        YahooClient instance = new YahooClient();
        instance.logout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class YahooClient.
     */
    @Test
    public void login() {
        System.out.println("login");
        String userName = "demo_rtsp";
        String password = "cmpe295";
        YahooClient instance = new YahooClient();
        boolean expResult = true;
        boolean result = instance.login(userName, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class YahooClient.
     */
    @Test
    public void sendMessage() {
        System.out.println("sendMessage");
        String messageTo = "priyankgandhi";
        String keywords = "sendMessage test successful.";
        YahooClient instance = new YahooClient();
        instance.sendMessage(messageTo, keywords);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleConnectionClosed method, of class YahooClient.
     */
    @Test
    public void handleConnectionClosed() {
        System.out.println("handleConnectionClosed");
        YahooClient instance = new YahooClient();
        instance.handleConnectionClosed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}