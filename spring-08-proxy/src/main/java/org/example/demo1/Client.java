package org.example.demo1;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/19 19:35
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        host.rent();

        Proxy proxy = new Proxy(host);
        proxy.rent();
        // 代理的附加操作
        proxy.fare();
        proxy.seeHouse();
    }
}

