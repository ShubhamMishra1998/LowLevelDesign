package com.lld.solid.dip.incorrect;

/***
 * This violates Dependency Inversion Principle as it depends on Low Level Module EmailService in future when new Service added we need to modify
 * this code which will violate OCP Principle.
 */
public class MessageService {
    private EmailService emailService = new EmailService();

    public void sendMessage(String message) {
        emailService.sendEmail(message);
    }
}
