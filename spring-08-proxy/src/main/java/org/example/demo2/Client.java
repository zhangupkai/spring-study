package org.example.demo2;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/19 20:00
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);

        proxy.query();
    }
}
