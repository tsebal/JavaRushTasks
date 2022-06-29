package com.javarush.task.jdk13.task28.task2811;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* 
Знакомство с Executors
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 1; i < 21; i++) {
            int finalI = i;
            executorService.submit(() -> doExpensiveOperation(finalI));
        }
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
    }

    private static void doExpensiveOperation(int localID) {
        System.out.println(Thread.currentThread().getName() + ", localID=" + localID);
    }
}
