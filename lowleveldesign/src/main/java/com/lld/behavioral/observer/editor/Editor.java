package com.lld.behavioral.observer.editor;

import com.lld.behavioral.observer.publisher.EventManager;

import java.io.File;

public class Editor {
    private EventManager eventManager;
    private File file;

    public Editor() {
        this.eventManager = new EventManager("open", "remove");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        eventManager.notify("open", file);
    }

    public void removeFile(String filePath) {
        this.file = new File(filePath);
        eventManager.notify("remove", file);
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public void setEventManager(EventManager eventManager) {
        this.eventManager = eventManager;
    }
}
