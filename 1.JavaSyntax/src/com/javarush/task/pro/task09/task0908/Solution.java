package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hexNum = "";
        String hexChars = "0123456789abcdef";
        if (binaryNumber != null && Pattern.matches("([0-1]+)", binaryNumber)) {
            if (binaryNumber.length() % 4 != 0) {
                for (int i = 0; i < (binaryNumber.length() % 4); i++) {
                    binaryNumber = "0" + binaryNumber;
                }
            }
            Pattern pattern = Pattern.compile("(?<=\\G.{4})");
            String[] hexNumQuad = pattern.split(binaryNumber);
            for (int i = 0; i < hexNumQuad.length; i++) {
                int x = 0;
                if (hexNumQuad[i].charAt(0) == '1') {
                    x = x + 8;
                }
                if (hexNumQuad[i].charAt(1) == '1') {
                    x = x + 4;
                }
                if (hexNumQuad[i].charAt(2) == '1') {
                    x = x + 2;
                }
                if (hexNumQuad[i].charAt(3) == '1') {
                    x = x + 1;
                }
                hexNum += hexChars.charAt(x);
            }
        }
        return hexNum;
    }

    public static String toBinary(String hexNumber) {
        String binNum = "";
        if (hexNumber != null && Pattern.matches("(([0-9]|[a-f])+)", hexNumber)) {
            for (int i = 0; i < hexNumber.length(); i++) {
                switch (hexNumber.charAt(i)) {
                    case '0':
                        binNum += "0000";
                        break;
                    case '1':
                        binNum += "0001";
                        break;
                    case '2':
                        binNum += "0010";
                        break;
                    case '3':
                        binNum += "0011";
                        break;
                    case '4':
                        binNum += "0100";
                        break;
                    case '5':
                        binNum += "0101";
                        break;
                    case '6':
                        binNum += "0110";
                        break;
                    case '7':
                        binNum += "0111";
                        break;
                    case '8':
                        binNum += "1000";
                        break;
                    case '9':
                        binNum += "1001";
                        break;
                    case 'a':
                        binNum += "1010";
                        break;
                    case 'b':
                        binNum += "1011";
                        break;
                    case 'c':
                        binNum += "1100";
                        break;
                    case 'd':
                        binNum += "1101";
                        break;
                    case 'e':
                        binNum += "1110";
                        break;
                    case 'f':
                        binNum += "1111";
                }
            }
        }
        return binNum;
    }
}
