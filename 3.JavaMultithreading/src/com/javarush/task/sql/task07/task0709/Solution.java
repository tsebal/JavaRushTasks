package com.javarush.task.sql.task07.task0709;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;

/* 
Метод getObject
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT name, weight, birthday, inn FROM employee");

        while (resultSet.next()) {
            System.out.printf("%s %s %s %s\n",
                    resultSet.getString("name"),
                    resultSet.getObject("weight", Float.class),
                    resultSet.getDate("birthday"),
                    resultSet.getObject("inn", Long.class));
        }
        statement.close();
        connection.close();
    }
}
