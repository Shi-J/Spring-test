package com.stone.aopdome.proxy;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/*
 implements MethodBeforeAdvice 实现该类
 重写  before 方法 实现前置通知
* */
public class LogBefore implements MethodBeforeAdvice
{
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable
    {
        System.out.println("我是前置通知,目标方法的方法名 "+ method.getName()+"\t目标对象" +o+"\t参数列表"+ Arrays.asList(objects));
    }
}
