package com.javarush.task.pro.task14.task1417;

/* 
Валидатор даты
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи дату в формате dd.mm.yyyy : ");
        String date = scanner.nextLine();
        validateDate(date);
        System.out.println("\nДата корректна.");
    }

    public static void validateDate(String date) {
        checkDateFormat(date);
        checkYearValue(date);
        checkMonthValue(date);
        checkDayValue(date);
    }

    public static void checkDateFormat(String date) {
        if (!date.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new InvalidDateFormatException();
        }
    }

    public static void checkYearValue(String date) {
        int year = Integer.parseInt(date.substring(6));
        if (year < 1900 || year > 2100) {
            throw new InvalidYearValueException();
        }
    }

    public static void checkMonthValue(String date) {
        int month = Integer.parseInt(date.substring(3, 5));
        if (month < 1 || month > 12) {
            throw new InvalidMonthValueException();
        }
    }

    public static void checkDayValue(String date) {
        HashMap<Integer, Integer> months = new HashMap<>() {{
            put(1, 31);
            put(2, 29);
            put(3, 31);
            put(4, 30);
            put(5, 31);
            put(6, 30);
            put(7, 31);
            put(8, 31);
            put(9, 30);
            put(10, 31);
            put(11, 30);
            put(12, 31);
        }};

        int day = Integer.parseInt(date.substring(0, 2));
        if (day < 1 || day > 31) {
            throw new InvalidDayValueException();
        }

        int month = Integer.parseInt(date.substring(3, 5));
        if (months.containsKey(month)) {
            if (day > months.get(month)) {
                throw new InvalidDayValueException();
            }
        }

    }
}
