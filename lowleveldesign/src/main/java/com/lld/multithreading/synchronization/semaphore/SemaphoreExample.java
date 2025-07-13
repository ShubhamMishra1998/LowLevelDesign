package com.lld.multithreading.synchronization.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    private static Semaphore semaphore = new Semaphore(2);
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();
                try {
                    semaphore.acquire();
                    System.out.println(threadName + " got the permit");
                    Thread.sleep(2000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }

            }
        };

        for(int i=0;i<10;i++) {
            new Thread(runnable,"Tread"+"["+i+"]").start();
        }
    }
}
