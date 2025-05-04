package com.lld.behavioral.observer.listeners;

import java.io.File;

public class LogEventListener implements EventListener {

    File file;
    public LogEventListener(File file) {
        this.file = file;
    }
    @Override
    public void update(File file, String eventName) {
        System.out.println("Event of type " +  eventName + " has happend to the " + file.getName());
    }
}
