package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(outputStream);
        System.setOut(newPrintStream);

        testString.printSomething();
        String result = outputStream.toString().replaceAll("te", "??");

        System.setOut(defaultPrintStream);
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
