package com.stone.aopdome.proxy;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogThrowing implements ThrowsAdvice
{
    //  异常类方法
    public void afterThrowing(Method method, Object[] args, Object target, Throwable throwable){
        System.out.println("我是异常通知,目标方法的方法名 "+ method.getName()+"\t目标对象" +target+"\t异常信息"+throwable);
    }
}
