package com.lld.behavioral.observer.listeners;

import java.io.File;

public interface EventListener {

    void update(File file, String eventName);
}
