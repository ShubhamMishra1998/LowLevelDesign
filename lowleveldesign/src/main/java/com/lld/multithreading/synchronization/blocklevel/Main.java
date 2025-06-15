package com.lld.multithreading.synchronization.blocklevel;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(0);

        for(int i=0;i<5;i++) {
            Thread thread1 = new Thread(counter);
            thread1.setName("Thread "+i);
            thread1.start();
        }

        System.out.println(counter.getCounter());
    }
}
