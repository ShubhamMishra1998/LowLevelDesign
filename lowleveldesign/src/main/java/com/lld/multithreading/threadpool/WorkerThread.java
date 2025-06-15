package com.lld.multithreading.threadpool;

public class WorkerThread implements Runnable {
    private final int id;

    public WorkerThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is processing on task " + id);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has completed task " + id);
    }

}
