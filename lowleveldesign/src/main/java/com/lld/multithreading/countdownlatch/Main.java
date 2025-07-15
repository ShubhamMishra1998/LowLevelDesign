package com.lld.multithreading.countdownlatch;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfServices = 3;
        CountDownLatch latch = new CountDownLatch(numberOfServices);
        ExecutorService service = Executors.newFixedThreadPool(numberOfServices);

        Future<String> future1 = service.submit(new PrintHello(latch));
        Future<String> future2 = service.submit(new PrintHello(latch));
        Future<String> future3 = service.submit(new PrintHello(latch));

        future1.get();
        future2.get();
        future3.get();

        latch.await();

        service.shutdown();

        System.out.println("Main started");


    }
}
