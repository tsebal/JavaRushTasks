package com.javarush.task.sql.task10.task1002;

import org.hibernate.Session;
import org.hibernate.query.Query;

/* 
task1002
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(getDirector());
    }

    public static Employee getDirector() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "FROM Employee WHERE smth = 'director'";
            Query<Employee> query = session.createQuery(hql, Employee.class);
            return query.uniqueResult();
        }
    }
}