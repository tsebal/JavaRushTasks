package com.javarush.task.sql.task16.task1604;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
Метод list
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            List<Object[]> projects = session.createNativeQuery("select id, title, created_time from project").list();
            projects.forEach(x -> System.out.printf("%s, %s, %s\n", x[0], x[1], x[2]));
        }
    }
}