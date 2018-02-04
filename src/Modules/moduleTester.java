/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//This class is used for testing experimental modules.
package Modules;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Kiran
 */
public class moduleTester {
    public static void main(String args[]){
        int otp = ThreadLocalRandom.current().nextInt(100000, 999999 + 1);
    
        String email = "iam191911918114@gmail.com";
        String subject = "Verify your account!";
        String body = "Your OTP is : " +Integer.toString(otp)+"\n\nHave a Great day :)";
        String sender = "carry.myproject@gmail.com";
        String pass = "@Support123";
        SendMail.send(email, subject, body, sender, pass);
    }
}
