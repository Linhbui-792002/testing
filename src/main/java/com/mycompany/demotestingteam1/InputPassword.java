/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demotestingteam1;

/**
 *
 * @author mac
 */
public class InputPassword {
        public static String inputPassword(String password) {
            
        //password[6; 25] least 1 special character
       
        String result = "";
        if (password.isEmpty()) {
            result = "password is empty";
        } else if (password.isBlank()) {
            result = "password is blank";
        } else if (password.length() < 6) {
            result = "password less than 6 character";
        } else if (password.length() > 25) {
            result = "password more than 25 character";
        } else if (containsSpecialChar(password) == false) {
            result = "password must contain at least 1 special character";
        } else if (containsUppercase(password)== false) {
        result = "password must contain at least 1 uppercase character";
        }else{
            result = "successfull";
        }
        return result;
    }

    
    public static boolean containsSpecialChar(String password) {
         char[] specialChars = {'!', '"', '#', '$', '%', '&', '\'', '(', ')',
            '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@',
            '[', '\\', ']', '^', '_', '`', '{', '|', '}', '~'};

        for (char c : specialChars) {
            if (password.indexOf(c) >= 0) {
                return true;
            }
            
        }
        return false;
    }

    
    public static boolean containsUppercase(String password) {
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
         return false;
    }
    
}
