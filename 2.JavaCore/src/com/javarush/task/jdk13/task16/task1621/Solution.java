package com.javarush.task.jdk13.task16.task1621;

/* 
Big Ben clock
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("Лондон", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException ignore) {
            }
        }

        private void printTime() throws InterruptedException {
            Thread.sleep(1000);
            if (this.seconds == 59) {
                this.seconds = 0;
                if (this.minutes == 59) {
                    this.minutes = 0;
                    if (this.hours == 23) {
                        this.hours = 0;
                    } else {
                        this.hours += 1;
                    }
                } else {
                    this.minutes += 1;
                }
            } else {
                this.seconds += 1;
            }

            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.println(String.format("В г. %s сейчас полночь!", cityName));
            } else {
                System.out.println(String.format("В г. %s сейчас %d:%d:%d!", cityName, hours, minutes, seconds));
            }
        }
    }
}
