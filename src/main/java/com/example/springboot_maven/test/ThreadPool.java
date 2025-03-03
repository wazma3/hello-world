package com.example.springboot_maven.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable(i+"-=="));
        }

        executorService.shutdown();
    }
}
