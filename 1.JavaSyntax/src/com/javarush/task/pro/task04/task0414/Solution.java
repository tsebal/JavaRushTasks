package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int number = console.nextInt();
        int i = 0;
        do {
            if (number <= 0 || number >=5) {
                System.out.println(str);
                break;
            }
            System.out.println(str);
            i++;
        } while (i < number);
    }
}