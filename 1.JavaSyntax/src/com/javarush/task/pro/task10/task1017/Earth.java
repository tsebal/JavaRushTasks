package com.javarush.task.pro.task10.task1017;

/* 
Создание материков
*/

public class Earth {
    public static void main(String[] args) {
        Africa africa = new Africa(30_320_000);
        Antarctica antarctica = new Antarctica(13_980_000);
        Australia australia = new Australia(8_890_000);
        Eurasia eurasia = new Eurasia(53_440_000);
        NorthAmerica northAmerica = new NorthAmerica(24_250_000);
        SouthAmerica southAmerica = new SouthAmerica(18_280_000);
    }
}
