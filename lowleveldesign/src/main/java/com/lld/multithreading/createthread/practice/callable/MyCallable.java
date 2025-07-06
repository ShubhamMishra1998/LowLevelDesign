package com.lld.multithreading.createthread.practice.callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private String name;

    public MyCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() {
        StringBuilder sb =  new StringBuilder();
        System.out.println(name + " is running");

        for(int i=0;i<5;i++) {
            sb.append(name).append("[").append(i).append("]").append("\n");
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
