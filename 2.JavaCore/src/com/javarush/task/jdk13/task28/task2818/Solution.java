package com.javarush.task.jdk13.task28.task2818;

import java.util.concurrent.*;

/* 
С ScheduledExecutor по галактике
*/

public class Solution {

    public static ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(3);

    public static void main(String[] args) throws Exception {
        ScheduledFuture<Integer> future = scheduledPool.schedule(new TheUltimateQuestion(), 365 * 7_500_000L, TimeUnit.DAYS);
        System.out.println(future.get());

        scheduledPool.shutdown();
    }
}
