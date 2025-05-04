package com.lld.behavioral.observer.listeners;

import java.io.File;

public class EmailEventListener implements EventListener {

    String email;

    public EmailEventListener(String email) {
        this.email = email;
    }

    @Override
    public void update(File file, String eventName) {
        System.out.println("Event of type " +  eventName + " has happend to the " + file.getName() + "Email has been sent to " + this.email);
    }
}
