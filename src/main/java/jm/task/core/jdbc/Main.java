package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        List<User> userList = new ArrayList<>();
        {
            userList.add(new User("Wooden", "Worm", (byte) 39));
            userList.add(new User("Sweaty", "Beast", (byte) 38));
            userList.add(new User("Do6pblu", "}I{yk", (byte) 37));
            userList.add(new User("Co4UH9IU-XAH", "unknown", (byte) 36));
        }

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userList.stream().
                forEach(x -> {userService.saveUser(x.getName(), x.getLastName(), x.getAge());
                              System.out.printf("User с именем - %s добавлен в базу данных \n", x.getName());});
        
        userService.getAllUsers().stream().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
