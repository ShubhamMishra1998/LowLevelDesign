package com.lld.multithreading.createthread.practice;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "  is running");

        for(int i=0;i<5;i++) {
            System.out.println(Thread.currentThread().getName() + " "+i+ " is running");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
