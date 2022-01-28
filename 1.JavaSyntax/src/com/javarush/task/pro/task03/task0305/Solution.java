package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        if ((a == b) && (a == c))
            System.out.println(a + " " + b + " " + c);
        if ((a == b) && (a != c))
            System.out.println(a + " " + b);
        if ((a == c) && (a != b))
            System.out.println(a + " " + c);
        if (((b == c) || (c == b)) && ((b != a) || (c != a)))
            System.out.println(b + " " + c);

    }
}
