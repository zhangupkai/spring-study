package org.example.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/19 18:01
 */

// @Component 注解
// 等价于 <bean id="user" class="org.example.pojo.User"/>
@Component
// 默认单例
@Scope("singleton")
public class User {
    @Value("zhang kai")
    private String name;

    @Value("zk")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
