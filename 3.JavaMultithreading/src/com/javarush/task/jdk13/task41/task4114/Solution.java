package com.javarush.task.jdk13.task41.task4114;

/* 
Калькулиссимо
*/

public class Solution {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate(3, "+", 9);
        calculator.calculate(3, "-", 9);
        calculator.calculate(3, "*", 9);
        calculator.calculate(3, "/", 9);
        calculator.calculate(-234, "/", 12);
        calculator.calculate(123, "+", -631);
    }
}
