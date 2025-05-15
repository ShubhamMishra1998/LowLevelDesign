package com.lld.solid.dip.incorrect;

/**
 * This is Low Level Module.
 */
public class EmailService {

    void sendEmail(String email) {
        System.out.println("Sending email to " + email);
    }
}
