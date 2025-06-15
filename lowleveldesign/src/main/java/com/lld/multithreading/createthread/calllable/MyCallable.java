package com.lld.multithreading.createthread.calllable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    private final String name;

    public MyCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<5;i++) {
            sb.append("Callable ").append(name).append(" is running: ").append(i).append("\n");
            Thread.sleep(500);
        }
        return sb.toString();
    }

}
