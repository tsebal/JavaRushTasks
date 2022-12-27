package com.javarush.task.sql.task10.task1001;

import org.hibernate.Session;
import org.hibernate.query.Query;

/* 
task1001
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "SELECT DISTINCT smth FROM Employee WHERE age > 18 ORDER BY smth";
            Query<String> query = session.createQuery(hql, String.class);
            query.list().forEach(System.out::println);
        }
    }
}