package org.example.pojo;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/18 19:26
 */
public class User {
    private String name;

    // Spring 使用无参构造创建对象
    public User(){
        System.out.println("User：默认无参构造");
    }

    public User(String name) {
        System.out.println("User：有参构造");
        this.name = name;
    }

    public String getName() {
        return name;
    }

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
