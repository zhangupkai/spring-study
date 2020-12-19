package org.example.service;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/19 21:06
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add user");
    }

    @Override
    public void delete() {
        System.out.println("delete user");
    }

    @Override
    public void update() {
        System.out.println("update user");
    }

    @Override
    public void select() {
        System.out.println("select user");
    }
}
