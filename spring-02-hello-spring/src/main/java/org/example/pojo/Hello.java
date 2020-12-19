package org.example.pojo;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/18 18:51
 */
public class Hello {

    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
