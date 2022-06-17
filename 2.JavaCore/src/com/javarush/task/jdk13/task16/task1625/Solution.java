package com.javarush.task.jdk13.task16.task1625;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
    }

    public static class TestThread extends Thread {
        @Override
        public void run() {

        }
    }
}