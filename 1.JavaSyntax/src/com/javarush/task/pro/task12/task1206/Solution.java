package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        char[] charArray = string.toCharArray();
        int digitCount = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])) {
                digitCount++;
            }
        }
        return digitCount;
    }

    public static int countLetters(String string) {
        char[] charArray = string.toCharArray();
        int letterCount = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                letterCount++;
            }
        }
        return letterCount;
    }

    public static int countSpaces(String string) {
        char[] charArray = string.toCharArray();
        int spacesCount = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isSpaceChar(charArray[i])) {
                spacesCount++;
            }
        }
        return spacesCount;
    }
}
