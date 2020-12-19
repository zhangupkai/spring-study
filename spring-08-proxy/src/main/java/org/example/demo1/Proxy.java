package org.example.demo1;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/19 19:36
 */
public class Proxy implements Rent{

    private Host host;

    public Proxy() {

    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }

    public void seeHouse() {
        System.out.println("中介带看房");
    }

    public void fare() {
        System.out.println("收中介费");
    }
}
