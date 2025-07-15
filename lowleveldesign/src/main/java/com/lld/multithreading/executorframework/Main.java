package com.lld.multithreading.executorframework;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Callable<Integer> callable = () -> {
            Thread.sleep(3000);
            return 5;
        };

        Future<Integer> result = service.submit(callable);
        System.out.println(result.get());

        System.out.println("after");

        service.shutdown();
    }

    private static int factorial(int n) {
        int ans = 1;
        for(int i=2;i<=n;i++) {
            ans*=i;
        }
        return ans;
    }
}
