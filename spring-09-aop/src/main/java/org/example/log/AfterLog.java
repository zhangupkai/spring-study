package org.example.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Description 日志增强类
 * @Author Kai
 * @Date 2020/12/19 21:11
 */
public class AfterLog implements AfterReturningAdvice {

    /**
     *
     * @param returnValue 返回值
     * @param method 要执行的目标方法
     * @param objects 参数
     * @param target 目标对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + "方法， 返回结果为：" + returnValue);
    }
}
