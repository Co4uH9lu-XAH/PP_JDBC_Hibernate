package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// Как лчше делать: в каждом методе обрабатывать исключение, или обработать одним разом , пробросив выше?

public class UserDaoJDBCImpl implements UserDao {
    //Statement statement = Util.myGetConnection().createStatement();

    public UserDaoJDBCImpl() throws SQLException {

    }

    public void createUsersTable() {
//        try {
//            statement.executeUpdate("CREATE TABLE IF NOT EXISTS user (id INT, name VARCHAR(50), lastname VARCHAR(50), age INT)");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void dropUsersTable() {
//        try {
//            statement.executeUpdate("DROP TABLE IF EXISTS user");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void saveUser(String name, String lastName, byte age) {
//        try {
//            statement.executeUpdate("INSERT INTO user VALUES (" + 1 + ", '" + name + "', " + "'" + lastName + "', " + age + ")");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
//        try {
//            ResultSet resultSet = statement.executeQuery("SELECT * from user");
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId((long) resultSet.getInt("id"));
//                user.setName(resultSet.getString("name"));
//                user.setLastName(resultSet.getString("lastname"));
//                user.setAge(resultSet.getByte("age"));
//                users.add(user);
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
        return users;
    }

    public void cleanUsersTable() {
//        try {
//            statement.executeUpdate("TRUNCATE user");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
   }
}
