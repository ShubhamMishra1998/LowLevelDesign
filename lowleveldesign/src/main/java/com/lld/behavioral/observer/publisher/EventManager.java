package com.lld.behavioral.observer.publisher;

import com.lld.behavioral.observer.listeners.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... eventsTypes) {
        for (String eventType : eventsTypes) {
            listeners.put(eventType, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<EventListener> users = listeners.get(eventType);
        users.forEach(el-> el.update(file, eventType));
    }

    public Map<String, List<EventListener>> getListeners() {
        return listeners;
    }
}
