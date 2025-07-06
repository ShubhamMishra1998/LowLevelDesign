package com.lld.multithreading.interviewquestions.implementdeadlock;

public class Main {
    public static void main(String[] args) {
        String lock1 = "shubham";
        String lock2 = "mishra";

        Runnable r1 = () -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock2) {
                    System.out.println("lock acquired");
                }
            }
        };

        Runnable r2 = () -> {
            synchronized (lock2) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock1) {
                    System.out.println("lock acquired");
                }
            }
        };


        Thread t1 = new Thread(r1, "thread1");
        Thread t2 = new Thread(r2, "thread1");

        t1.start();
        t2.start();

    }
}
