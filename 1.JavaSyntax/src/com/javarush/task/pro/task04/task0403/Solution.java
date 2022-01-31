package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean isExit = false;
        int sum = 0;
        while (!isExit) {
            if (console.hasNextInt()) {
                int a = console.nextInt();
                sum += a;
            }
            if (console.hasNextLine()) {
                String s = console.nextLine();
                if (s.equals("ENTER")) {
                    isExit = true;
                    System.out.println(sum);
                }
            }
        }
    }
}