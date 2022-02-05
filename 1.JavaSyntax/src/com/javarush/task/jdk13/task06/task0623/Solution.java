package com.javarush.task.jdk13.task06.task0623;

/* 
Знакомство с двумерным массивом
*/

public class Solution {
    public static int[][] array = new int[2][3];

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int rnd = (int) (Math.random() * 10 + 1);
                array[i][j] = rnd;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
