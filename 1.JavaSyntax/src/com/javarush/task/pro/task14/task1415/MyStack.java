package com.javarush.task.pro.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        storage.add(0, s);
    }

    public String pop() {
        String result = storage.get(0);
        storage.remove(0);
        return result;
    }

    public String peek() {
        return storage.get(0);
    }

    public boolean empty() {
        return storage.isEmpty() ? true : false;
    }

    public int search(String s) {
        return storage.contains(s) ? storage.indexOf(s) : -1;
    }
}
