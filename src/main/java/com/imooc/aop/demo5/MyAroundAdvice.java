package com.imooc.aop.demo5;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Author: dtvikey
 * @Date: 18-11-2 上午11:14
 * @Version 1.0
 */
public class MyAroundAdvice implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("环绕前增强=======================");

        Object obj =  methodInvocation.proceed();

        System.out.println("环绕后增强=======================");
        return obj;
    }
}
