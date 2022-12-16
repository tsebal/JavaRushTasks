package com.javarush.task.sql.task07.task0706;

/* 
task0706
*/

import java.sql.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employee LIMIT 1");
        ResultSetMetaData queryMetaData = resultSet.getMetaData();

        int columnCount = queryMetaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            String name = queryMetaData.getColumnName(column);
            String typeName = queryMetaData.getColumnTypeName(column);
            System.out.print(name + "(" + typeName + ") ");
        }

        statement.close();
        connection.close();

    }
}
