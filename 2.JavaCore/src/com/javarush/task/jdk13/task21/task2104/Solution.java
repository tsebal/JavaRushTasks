package com.javarush.task.jdk13.task21.task2104;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* 
Глубокое клонирование карты
*/

public class Solution implements Cloneable {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        try {
            Solution clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            
            User user = (User) obj;
            if (!Objects.equals(age, user.age)) {
                return false;
            }
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            int result = age;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }
    }

    @Override
    protected Solution clone() throws CloneNotSupportedException {
        Solution newSolution = (Solution) super.clone();
        Map<String, User> newUsers = new LinkedHashMap<>();
        for (String key : newSolution.users.keySet()) {
            User user = newSolution.users.get(key);
            newUsers.put(key, (User) user.clone());
        }
        newSolution.users = newUsers;
        return newSolution;
    }

}
