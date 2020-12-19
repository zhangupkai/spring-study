package org.example.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Description 日志增强类
 * @Author Kai
 * @Date 2020/12/19 21:08
 */
public class BeforeLog implements MethodBeforeAdvice {
    /**
     *
     * @param method 要执行的目标方法
     * @param objects 参数
     * @param target 目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        assert target != null;
        System.out.println(target.getClass().getName() + "的" + method.getName() + "被执行了");
    }
}
