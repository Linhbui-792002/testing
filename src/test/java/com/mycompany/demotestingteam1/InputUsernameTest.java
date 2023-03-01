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
public class InputUsernameTest {
    InputUsername test;
    public InputUsernameTest() {
    }

   
    
//    test username[5; 30]
    
    /*
        UTCID01
        test username is empty
    */
    
    @Test
    public void testCheckEmptyUserName() {
        String username ="";
        String expResult = test.inputUserName(username);
        String result = "username is empty";
        assertEquals(expResult, result, "username is emplty");
        
    }
    /*
        UTCID02
        test username is blank
    */
    @Test
    public void testCheckBlankUserName() {
        String username ="        "; //8 space
        String expResult = test.inputUserName(username);
        String result = "username is blank";
        assertEquals(expResult, result, "username is blank");
        
    }
    
    
    /**
     *  UTCID03
     * Test BoundaryLeft - 1
     */

    
     @Test
    public void testOutBoundaryLeftUserName() {
        String username ="asdfe"; // 5 character
        String expResult = test.inputUserName(username);
        String result = "username less than 6 character";
        assertEquals(expResult, result, "username less than 6 character");
        
    }
    
    /**
     * UTCID04
     * Test BoundaryLeft
     */

     @Test
    public void testBoundaryLeftUserName() {
        String username ="qwerty"; // 6 character
        String expResult = test.inputUserName(username);
        String result = "successfull";
        assertEquals(expResult, result, "successfull");
        
    }
    /**
     * UTCID05
     * Test BoundaryLeft + 1
     */

     @Test
    public void testInBoundaryLeftMoreOneUserName() {
        String username ="qwertyw"; // 7 character
        String expResult = test.inputUserName(username);
        String result = "successfull";
        assertEquals(expResult, result, "successfull");
    }
    
     /**
      * UTCID06
     * Test BoundaryRight -1
     */

    
     @Test
    public void testInBoundaryRightUserName() {
        String username ="qwertyuioasdfghjklzxcvbnmhgfd"; // 29 character
        String expResult = test.inputUserName(username);
        String result = "successfull";
        assertEquals(expResult, result, "successfull");
        
    }
    
    
    /**
     * UTCID07
     * Test BoundaryRight
     */

    
     @Test
    public void testBoundaryRightUserName() {
        String username ="qwertyuioasdfghjklzxcvbnmhgfda"; // 30 character
        String expResult = test.inputUserName(username);
        String result = "successfull";
        assertEquals(expResult, result, "successfull");
        
    }
    
    /**
     * UTCID08
     * Test BoundaryRight +1
     */

    
     @Test
    public void testOutBoundaryRightMoreOneUserName() {
        String username ="qwertyuioasdfghjklzxcvbnmhgfdaaq"; // 31 character
        String expResult = test.inputUserName(username);
        String result = "username more than 30 character";
        assertEquals(expResult, result, "username more than 30 character");
        
    }
    
    
    
}