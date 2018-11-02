package com.imooc.aop.demo3;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author: dtvikey
 * @Date: 18-11-2 上午9:50
 * @Version 1.0
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {


    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("前置增强=====================");
    }



}
