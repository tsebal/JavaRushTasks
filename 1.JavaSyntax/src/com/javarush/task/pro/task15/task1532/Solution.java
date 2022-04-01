package com.javarush.task.pro.task15.task1532;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

/* 
Шифр
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(encrypt("abcdefghi"));
    }

    public static ByteArrayOutputStream encrypt(String message) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] arrayOfByte = message.getBytes(StandardCharsets.UTF_8);
        int length = arrayOfByte.length;
        for (int i = 0; i < length / 2; i++) {
            baos.write(arrayOfByte[i]);
            baos.write(arrayOfByte[length - i - 1]);
        }
        if (length % 2 == 1) {
            baos.write(arrayOfByte[length / 2]);
        }

        return baos;
    }
}
