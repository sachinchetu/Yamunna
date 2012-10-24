/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yamunacrm.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author uday
 */
public class AuthenticationServiceTest {

    public AuthenticationServiceTest() {
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
     * Test of authenticateUser method, of class AuthenticationService.
     */
    @Test
    public void testAuthenticateUser() {
        System.out.println("authenticateUser");
        String userName = "jd";
        String password = "india";
        AuthenticationService instance = new AuthenticationService();
        boolean expResult = false;
        boolean result = instance.authenticateUser(userName, password);
        System.out.println("Test----"+result);

    }

}