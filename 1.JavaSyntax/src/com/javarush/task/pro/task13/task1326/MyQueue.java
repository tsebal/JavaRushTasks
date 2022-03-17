package com.javarush.task.pro.task13.task1326;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyQueue extends AbstractQueue<String> {

    private final List<String> values = new ArrayList<>();

    @Override
    public Iterator<String> iterator() {
        return values.listIterator();
    }

    @Override
    public int size() {
        return values.size();
    }

    @Override
    public boolean offer(String o) {
        values.add(o);
        return true;
    }

    @Override
    public String poll() {
        if (values.isEmpty()) {
            return null;
        } else {
            String value = values.get(0);
            values.remove(0);
            return value;
        }
    }

    @Override
    public String peek() {
        if (values.isEmpty()) {
            return null;
        } else {
            return values.get(0);
        }
    }
}
