package org.example.demo4;

import org.example.demo2.UserService;
import org.example.demo2.UserServiceImpl;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/19 20:43
 */
public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserServiceImpl userService = new UserServiceImpl();
        // 代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 设置要代理的类
        pih.setTarget(userService);
        // 动态生成代理类
        UserService proxy = (UserService) pih.getProxy();

        proxy.delete();
    }
}
