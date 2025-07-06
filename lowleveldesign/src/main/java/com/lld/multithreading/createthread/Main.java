package com.lld.multithreading.createthread;

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("thread1");
        MyThread thread2 = new MyThread("thread2");
        thread1.start();
//        thread2.start();


//        MyRunnable runnable1 = new MyRunnable("runnable1");
//        MyRunnable runnable2 = new MyRunnable("runnabl2");
//        Thread thread3 = new Thread(runnable1);
//        Thread thread4 = new Thread(runnable2);
//        thread3.start();
//        thread4.start();
    }
}
