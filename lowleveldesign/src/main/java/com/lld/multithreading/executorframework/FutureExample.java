package com.lld.multithreading.executorframework;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);

        Callable<String> callable =  () -> "hello world";

        Future<String> future = service.submit(callable);

        System.out.println(future.get());
    }
}
