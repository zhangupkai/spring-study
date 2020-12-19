package org.example.pojo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/19 16:43
 */
public class People {

    private String name;

    // @Autowired(required = false) 允许cat在容器中不存在
    @Autowired(required = false)
    private Cat cat;
    @Autowired
    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
