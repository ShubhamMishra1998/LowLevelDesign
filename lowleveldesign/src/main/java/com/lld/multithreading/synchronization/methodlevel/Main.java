package com.lld.multithreading.synchronization.methodlevel;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(0);

        for(int i=0;i<3;i++) {
            Thread thread = new Thread(counter);
            thread.setName("Thread "+i);
            thread.start();
        }
    }
}
