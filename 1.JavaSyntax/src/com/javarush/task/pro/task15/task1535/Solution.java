package com.javarush.task.pro.task15.task1535;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        splitFile("C:\\test\\file.txt", 1024);
    }

    public static void splitFile(String fileName, int partSize) throws IOException {
        try (FileChannel inputChannel = FileChannel.open(Paths.get(fileName), StandardOpenOption.READ)) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(partSize);
            int fileParts = (int) Math.ceil(inputChannel.size() / partSize);
            for (int i = 1; i <= fileParts; i++) {
                String newFileName = getNewFileName(fileName, i);
                Path newFilePath = Path.of(newFileName);

                Files.createFile(newFilePath);
                inputChannel.read(byteBuffer);
                byteBuffer.flip();
                try (FileChannel outputChannel = FileChannel.open(Paths.get(newFileName),
                        StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)) {
                    outputChannel.write(byteBuffer);
                }
                byteBuffer.flip();
            }

        }
    }

    public static String getNewFileName(String oldFileName, int number) {
        int dotIndex = oldFileName.lastIndexOf(".");
        return oldFileName.substring(0, dotIndex) + number + oldFileName.substring(dotIndex);
    }
}
