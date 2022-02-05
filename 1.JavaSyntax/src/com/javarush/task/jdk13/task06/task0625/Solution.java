package com.javarush.task.jdk13.task06.task0625;

import java.util.Scanner;

/* 
Минимальная сумма
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int minSum = Integer.MAX_VALUE;
        int[] arrayCol = {0, 0, 0};
        int tmpValueRow = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = console.nextInt();
                tmpValueRow += array[i][j];
                arrayCol[j] += array[i][j];
            }
            if (tmpValueRow < minSum) {
                minSum = tmpValueRow;
            }
            tmpValueRow = 0;
        }
        for (int i = 0; i < arrayCol.length; i++) {
            if (arrayCol[i] < minSum) {
                minSum = arrayCol[i];
            }
        }
        System.out.println(minSum);
    }
}
