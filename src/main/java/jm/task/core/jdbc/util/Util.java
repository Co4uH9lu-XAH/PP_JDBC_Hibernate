package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    public static Connection myGetConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            // System.out.println("Три зеленых свистка, если соединение установлено");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
