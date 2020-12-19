package org.example.demo1;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/19 19:34
 */
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }
}
