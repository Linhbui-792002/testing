/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.demotestingteam1;

/**
 *
 * @author mac
 */
public class InputUsername {

    public static String inputUserName(String username) {
        //username[6; 30]
        String result = "";
        if (username.isEmpty()) {
            result = "username is empty";
        } else if (username.length()<=0) {
            result = "username is blank";
        } else if (username.length() < 6) {
            result = "username less than 6 character";
        } else if (username.length() > 30) {
            result = "username more than 30 character";
        } else {
            result = "successfull";
        }
        return result;
    }

}