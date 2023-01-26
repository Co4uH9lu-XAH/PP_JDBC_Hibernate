package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    // Подключение для JDBC

//    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
//    private static final String USER_NAME = "root";
//    private static final String PASSWORD = "root";
//
//    public static Connection myGetConnection() {
//        Connection connection;
//        try {
//            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
//            // System.out.println("Три зеленых свистка, если соединение установлено");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return connection;
//    }

    // Подключение для Hibernate
    private static SessionFactory sessionFactory;

    static {
        Configuration configuration = new Configuration();
        Properties settings = new Properties();

        settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        settings.put(Environment.URL, "jdbc:mysql://localhost:3306/testdb");
        settings.put(Environment.USER, "root");
        settings.put(Environment.PASS, "root");
        settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
        settings.put(Environment.SHOW_SQL, "true");
        settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

        configuration.setProperties(settings);
        configuration.addAnnotatedClass(User.class);

        sessionFactory = configuration.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
