/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.demotestingteam1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mac
 */
public class InputPasswordTest {

    InputPassword test;

    /*
        test input password[6,25] Contains Special Character
                                  Contains Uppercase Character
     */

    /*
        UTCID01
        test password is empty
     */
    @Test
    public void testCheckEmptyPassword() {
        String password = "";
        String expResult = test.inputPassword(password);
        String result = "password is empty";
        assertEquals(expResult, result, "password is emplty");

    }

    /*
        UTCID02
        test password is blank
     */
    @Test
    public void testCheckBlankPassword() {
        String password = "        "; //8 space
        String expResult = test.inputPassword(password);
        String result = "password is blank";
        assertEquals(expResult, result, "password is blank");

    }

    /**
     * UTCID03
     * Test BoundaryLeft - 1
     */
    @Test
    public void testOutBoundaryLeftPassword() {
        String password = "asdfe"; // 5 character
        String expResult = test.inputPassword(password);
        String result = "password less than 6 character";
        assertEquals(expResult, result, "password less than 6 character");

    }


    /**
     * UTCID04
     * Test BoundaryLeft is 6 Special Character
     */
    @Test
    public void testBoundaryLeftHaveSpecialPassword() {
        String password = "------"; // 6 Special Character
        String expResult = test.inputPassword(password);
        String result = "password must contain at least 1 uppercase character";
        assertEquals(expResult, result, "password must contain at least 1 uppercase character");

    }

    /**
     * UTCID05
     * Test BoundaryLeft have 6 Special Character
     */
    @Test
    public void testBoundaryLeftHaveUppercaseSpecialPassword() {
        String password = "A-----"; // 6 character have 1 uppercase character and 5 Special Character
        String expResult = test.inputPassword(password);
        String result = "successfull";
        assertEquals(expResult, result, "successfull");

    }

    
    /**
     * UTCID06
     * Test BoundaryLeft + 1 is 7 Special Character
     */
    @Test
    public void testInBoundaryLeftMoreOneSpecialCharacterPassword() {
        String password = "-------"; // 7 character
        String expResult = test.inputPassword(password);
        String result = "password must contain at least 1 uppercase character";
        assertEquals(expResult, result, "password must contain at least 1 uppercase character");
    }

    /**
     * UTCID07
     * Test BoundaryLeft + 1 is 7 Special Character
     */
    @Test
    public void testInBoundaryLeftMoreOneSpecialUppercaseCharacterPassword() {
        String password = "A------"; // 7 character
        String expResult = test.inputPassword(password);
        String result = "successfull";
        assertEquals(expResult, result, "successfull");
    }

    /**
     * UTCID08
     * Test BoundaryRight -1 is Special and Uppercase Character
     */
    @Test
    public void testInBoundaryRightOneSpecialPassword() {
        String password = "------------------------"; // 24 character
        String expResult = test.inputPassword(password);
        String result = "password must contain at least 1 uppercase character";
        assertEquals(expResult, result, "password must contain at least 1 uppercase character");
    }

    /**
     * UTCID09
     * Test BoundaryRight -1 is Special Character and uppercase character
     */
    @Test
    public void testInBoundaryRightOneSpecialUppercaseCharacterPassword() {
        String password = "A-----------------------"; // 24 character
        String expResult = test.inputPassword(password);
        String result = "successfull";
        assertEquals(expResult, result, "successfull");
    }

    /**
     * UTCID10
     * Test BoundaryRight is Special Character
     */
    @Test
    public void testBoundaryRightSpecialCharacterPassword() {
        String password = "-------------------------"; // 25 character
        String expResult = test.inputPassword(password);
        String result = "password must contain at least 1 uppercase character";
        assertEquals(expResult, result, "password must contain at least 1 uppercase character");
    }

    /**
     * UTCID11
     * Test BoundaryRight is have Special Character and uppercase character
     */
    @Test
    public void testBoundaryRightSpecialUppercaseSpecialCharacterPassword() {
        String password = "A------------------------"; // 25 character
        String expResult = test.inputPassword(password);
        String result = "successfull";
        assertEquals(expResult, result, "successfull");

    }

    /**
     * UTCID12
     * Test BoundaryRight +1
     */
    @Test
    public void testOutBoundaryRightMoreOnePassword() {
        String password = "--------------------------"; // 26 character
        String expResult = test.inputPassword(password);
        String result = "password more than 25 character";
        assertEquals(expResult, result, "password more than 25 character");

    }

    /*
        UTCID13
        test password not ContainsSpecialChar
     */
    @Test
    public void testNotContainsSpecialChar() {
        String Password = "Linhbx";
        boolean expResult = test.containsSpecialChar(Password);
        boolean result = false;
        assertEquals(expResult, result, "password must contain at least 1 special character");
    }

    /*
        UTCID14
        test password ContainsSpecialChar
     */
    @Test
    public void testContainsSpecialChar() {
        String password = "Linh_bx";
        boolean expResult = test.containsSpecialChar(password);
        boolean result = true;
        assertEquals(expResult, result, "password contain special character");
    }

    /*
        UTCID15
        test password not uppercase character
     */
    @Test
    public void testNotContainsUppercase() {
        String password = "linhbx";
        boolean expResult = test.containsUppercase(password);
        boolean result = false;
        assertEquals(expResult, result, "password must contain at least 1 uppercase character");
    }

    /*  UTCID16
        test password not uppercase character
     */
    @Test
    public void testContainsUppercase() {
        String password = "Linhbx";
        boolean expResult = test.containsUppercase(password);
        boolean result = true;
        assertEquals(expResult, result, "password contain uppercase character");
    }

}
