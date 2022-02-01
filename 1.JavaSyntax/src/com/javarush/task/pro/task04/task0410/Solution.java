package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2 && x != min1) {
                min2 = x;
            }
        }
        if (min2 != Integer.MAX_VALUE) {
            System.out.println(min2);
        }
    }
}