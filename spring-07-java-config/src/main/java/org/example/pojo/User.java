package org.example.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/19 18:29
 */

@Component
public class User {

    private String name;

    public String getName() {
        return name;
    }

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
