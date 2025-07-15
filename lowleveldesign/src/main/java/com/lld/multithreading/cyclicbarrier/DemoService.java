package com.lld.multithreading.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class DemoService implements Runnable {

    private final CyclicBarrier barrier;
    private final long waitTime;

    public DemoService(CyclicBarrier barrier, long waitTime) {
        this.barrier = barrier;
        this.waitTime = waitTime;
    }

    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName() + " service started");
            Thread.sleep(waitTime);
            System.out.println(Thread.currentThread().getName() + " service completed");
            barrier.await();
        }catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
