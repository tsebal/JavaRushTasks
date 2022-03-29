package com.javarush.task.pro.task15.task1526;

import java.io.*;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(System.in);
             FileReader fileReader = new FileReader(scanner.nextLine())) {
            char[] buffer = new char[1];
            while (fileReader.ready()) {
                fileReader.read(buffer);
                if (buffer[0] != '.' && buffer[0] != ',' && buffer[0] != ' ') {
                    stringBuilder.append(buffer);
                }
            }
        } catch (IOException e) {

        }
        System.out.println(stringBuilder);
    }
}