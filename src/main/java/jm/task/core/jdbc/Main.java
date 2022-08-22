package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.dropUsersTable(); //++
        userService.createUsersTable(); //++
//        userService.saveUser("Ivan", "Ivanov", (byte) 5);
//        userService.saveUser("Ivan", "Ivanov", (byte) 5);
//        userService.saveUser("Ivan", "Ivanov", (byte) 5);
//        userService.removeUserById(3L); //++

//        System.out.println(userService.getAllUsers());
//        userService.cleanUsersTable();
    }
}
