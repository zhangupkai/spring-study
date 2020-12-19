package org.example.diyAspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Description 使用注解方式实现AOP
 * @Author Kai
 * @Date 2020/12/19 21:56
 */

@Aspect
public class AnnotationPointcut {

    @Before("execution(* org.example.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("=============before=============");
    }

    @After("execution(* org.example.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("=============after=============");
    }

}
