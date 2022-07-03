package com.javarush.task.jdk13.task23.task2301;

/* 
Inner
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public static void main(String[] args) {

    }

    public static Solution[] getTwoSolutions() {
        Solution solution1 = new Solution();
        solution1.innerClasses[0] = new Solution.InnerClass();
        solution1.innerClasses[1] = new Solution.InnerClass();
        Solution solution2 = new Solution();
        solution2.innerClasses[0] = new Solution.InnerClass();
        solution2.innerClasses[1] = new Solution.InnerClass();

        Solution[] result = {solution1, solution2};
        return result;
    }

    public static class InnerClass {
    }
}
