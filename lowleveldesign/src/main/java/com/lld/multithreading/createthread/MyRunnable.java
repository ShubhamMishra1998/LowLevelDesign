package com.lld.multithreading.createthread;

public class MyRunnable implements Runnable{

    private String name;
    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Thread " + Thread.currentThread().threadId() + " is running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
