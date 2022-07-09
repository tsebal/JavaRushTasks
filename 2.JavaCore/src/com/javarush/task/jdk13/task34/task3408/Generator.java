package com.javarush.task.jdk13.task34.task3408;

public class Generator<T> {
    private Class<T> clazz;

    public Generator(Class<T> aClass) {
        this.clazz = aClass;
    }

    T newInstance() throws Exception {
        return clazz.getDeclaredConstructor().newInstance();
    }
}
