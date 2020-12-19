package org.example.demo2;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/19 19:49
 */
public class UserServiceImpl implements UserService{
    // 如需打印日志需要在每个方法中新增代码
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
    public void query() {
        System.out.println("query user");
    }
}
