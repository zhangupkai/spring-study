package org.example.demo3;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/19 20:29
 */
public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();

        // 代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host);
        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();
    }

}
