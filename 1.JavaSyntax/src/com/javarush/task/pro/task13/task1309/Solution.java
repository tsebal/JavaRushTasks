package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Vasya Petrov", 4.3);
        grades.put("Vova Botanov", 5d);
        grades.put("Anton Bich", 3.7);
        grades.put("Valeriy Freeman", 4.1);
        grades.put("Elena Erokhina", 4.6);
    }
}
