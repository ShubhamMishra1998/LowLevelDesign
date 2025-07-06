package com.lld.multithreading.createthread.practice;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);

//        t1.start();
//        t2.start();


        Runnable runnable1 = ()-> {
            System.out.println(Thread.currentThread().getName() + "  is running");
            for(int i=0;i<5;i++) {
                System.out.println(Thread.currentThread().getName() + " "+i+ " is running");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable runnable2 = ()-> {
            System.out.println(Thread.currentThread().getName() + "  is running");
            for(int i=0;i<5;i++) {
                System.out.println(Thread.currentThread().getName() + " "+i+ " is running");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t3 = new Thread(runnable1, "Thread3");
        Thread t4 = new Thread(runnable2, "Thread4");

        t3.start();
        t4.start();


    }
}
