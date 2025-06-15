package com.lld.multithreading.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=1;i<=5;i++) {
            executorService.submit(new WorkerThread(i));
        }
        executorService.shutdown();
    }
}
