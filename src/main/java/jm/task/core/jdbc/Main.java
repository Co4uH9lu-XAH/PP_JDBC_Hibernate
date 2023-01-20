package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Wooden", "Worm", (byte) 39);
        userService.saveUser("Sweaty", "Beast", (byte) 38);
        userService.saveUser("Do6pblu", "}I{yk", (byte) 12);
        userService.saveUser("Co4UH9IU-XAH", "unknown", (byte) 30);

        userService.getAllUsers().stream().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
