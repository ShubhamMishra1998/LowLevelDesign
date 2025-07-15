package com.lld.multithreading.countdownlatch;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class PrintHello implements Callable<String> {
    private final CountDownLatch latch;

    PrintHello(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.sleep(1000);
        }finally {
            latch.countDown();
        }

        return "ok";
    }
}
