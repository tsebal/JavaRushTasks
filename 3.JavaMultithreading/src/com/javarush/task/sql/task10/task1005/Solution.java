package com.javarush.task.sql.task10.task1005;

import com.javarush.task.sql.task10.task1005.entities.Book;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
task1005
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Book> books;
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            String hql = "FROM Book WHERE author.fullName = 'Mark Twain' AND publisher.name = 'Фолио'";
            Query<Book> query = session.createQuery(hql, Book.class);
            books = query.list();
        }

        books.forEach(System.out::println);
    }
}