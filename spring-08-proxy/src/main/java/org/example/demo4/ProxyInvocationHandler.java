package org.example.demo4;

import org.example.demo3.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/19 20:23
 */

// 用这个类动态生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    // 生成得到代理类
    public Object getProxy() {
        // Proxy提供创建动态代理类的静态方法
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    // 处理代理实例并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        log(method.getName());
        // 动态代理本质：使用反射机制
        Object result = method.invoke(target, args);
        return result;
    }

    public void log(String msg) {
        System.out.println(new Date(System.currentTimeMillis()) + ": call function " + msg);
    }
}
