package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int[] numbersArray = new int[N];
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                numbersArray[i] = console.nextInt();
            }
        }
        if (N % 2 == 0) {
            for (int i = N; i > 0 ; i--) {
                System.out.println(numbersArray[i - 1]);
            }
        } else {
            for (int i = 0; i < numbersArray.length; i++) {
                System.out.println(numbersArray[i]);
            }
        }
    }
}
