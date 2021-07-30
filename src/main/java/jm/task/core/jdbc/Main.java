package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Matt", "Bellamy", (byte) 41);
        userService.saveUser("Tom", "Chaplin", (byte) 35);
        userService.saveUser("Jack", "White", (byte) 21);
        userService.saveUser("Brian", "Molko", (byte) 53);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
