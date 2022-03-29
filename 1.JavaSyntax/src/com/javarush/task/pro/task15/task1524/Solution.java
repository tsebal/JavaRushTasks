package com.javarush.task.pro.task15.task1524;

import java.io.*;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFile = scanner.nextLine();
        String outputFile = scanner.nextLine();
        scanner.close();
        try (FileInputStream fIS = new FileInputStream(inputFile);
             FileOutputStream fOS = new FileOutputStream(outputFile)) {
            byte[] buffer = new byte[2];
            while (fIS.available() > 0) {
                int real = fIS.read(buffer);
                if (real == 2) {
                    fOS.write(buffer[1]);
                    fOS.write(buffer[0]);
                } else if (real == 1) {
                    fOS.write(buffer[0]);
                }
            }
        } catch (IOException e) {

        }
    }
}