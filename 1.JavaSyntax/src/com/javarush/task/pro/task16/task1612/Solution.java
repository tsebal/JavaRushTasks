package com.javarush.task.pro.task16.task1612;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/* 
Синтезируем LocalDateTime
*/

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        Set<LocalDateTime> dateTimeSet = new HashSet<>();
        LocalDateTime localDateTime = LocalDateTime.now();
        for (Map.Entry<LocalDate, List<LocalTime>> mapItem : sourceMap.entrySet()) {
            LocalDate keyDate = mapItem.getKey();
            List<LocalTime> localTimeList = mapItem.getValue();
            for (LocalTime localTimeValue : localTimeList) {
                localDateTime = LocalDateTime.of(keyDate, localTimeValue);
                dateTimeSet.add(localDateTime);
            }
        }
        return dateTimeSet;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}