package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringsLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node currentNode = new Node();
        currentNode.value = value;

        Node lastNode = last.prev;
        lastNode.next = currentNode;
        currentNode.prev = lastNode;
        last.prev = currentNode;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
