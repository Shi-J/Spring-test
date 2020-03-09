package com.stone.aopdome.proxy;


import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogAfterReturning implements AfterReturningAdvice
{

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable
    {
        System.out.println("我是后置通知,目标方法的方法名 "+ method.getName()+"\t目标对象" +o1+"\t参数列表"+ Arrays.asList(objects));
    }
}
