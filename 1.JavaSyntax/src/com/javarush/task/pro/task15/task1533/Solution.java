package com.javarush.task.pro.task15.task1533;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* 
Замена потока
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        writeData("Justinian", "Justinian@mega.city.one", 41, 391);
    }

    public static ByteArrayOutputStream writeData(String name, String email, int level, int rating) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(("Имя: " + name + "\n").getBytes(StandardCharsets.UTF_8));
        baos.write(("Почта: " + email + "\n").getBytes(StandardCharsets.UTF_8));
        baos.write(("Уровень: " + level + "\n").getBytes(StandardCharsets.UTF_8));
        baos.write(("Рейтинг: " + rating + "\n").getBytes(StandardCharsets.UTF_8));
        return baos;
    }
}
