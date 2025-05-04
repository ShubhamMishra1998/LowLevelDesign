package com.lld.behavioral.observer;

import com.lld.behavioral.observer.editor.Editor;
import com.lld.behavioral.observer.listeners.LogEventListener;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.getEventManager().subscribe("open", new LogEventListener(new File("/temp/abc.txt")));
        editor.getEventManager().subscribe("remove", new LogEventListener(new File("/temp/abc.txt")));

        editor.openFile("/temp/abc.txt");
        editor.removeFile("/temp/abc.txt");
    }
}
