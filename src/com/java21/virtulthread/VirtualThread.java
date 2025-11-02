package com.java21.virtulthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThread {
    public static  void main(String [] args) throws InterruptedException {
        Runnable runnable = () -> System.out.println("Inside Runnable");

        // First way
        Thread thread = Thread.startVirtualThread(runnable);
        thread.join();

        //Second way
        Thread.ofVirtual().start(runnable);
        thread.join();

        //Third way
        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();
        executorService.execute(runnable);
    }
}
