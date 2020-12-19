package org.example.demo2;

import java.util.Date;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/19 19:52
 */
// 不改变原有UserServiceImpl代码 加一层代理输出日志 // 可能是装饰者模式？
public class UserServiceProxy implements UserService{

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    public void log(String msg) {
        System.out.println(new Date(System.currentTimeMillis()) + ": call function " + msg);
    }

}
