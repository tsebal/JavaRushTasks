package com.javarush.task.jdk13.task12.task1216;

/* 
Кошки не должны быть абстрактными!
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

        @Override
        public String getName() {
            return "AnyName";
        }

        @Override
        public Pet getChild() {
            return null;
        }
    }

    public static class Dog extends Pet {

        @Override
        public String getName() {
            return "AnyName";
        }

        @Override
        public Pet getChild() {
            return null;
        }
    }

}
