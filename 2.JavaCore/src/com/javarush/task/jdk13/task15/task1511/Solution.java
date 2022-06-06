package com.javarush.task.jdk13.task15.task1511;

/* 
Статики и котики
*/

public class Solution {
    public static Cat cat;

    public static class Cat {
        public String name;
    }

    static {
        cat = new Cat();
        cat.name = "Vaska";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }
}
