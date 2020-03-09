package com.stone.aopdome.proxy;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAround implements MethodInterceptor
{
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable
    {
        Object result = null;
        try
        {
            System.out.println("我是 [环绕通知]的 前置通知");

            result= invocation.proceed(); // 控制着目标方法是否执行
            System.out.println("我是 [环绕通知]的 后置通知");
            System.out.println("目标方法的返回值 "+result+"\t 目标对象 " +invocation.getThis()+"\t 调用方法的方法名" + invocation.getMethod().getName());


        }
        catch (Exception e)
        {
            System.out.println("我是 [环绕通知]的 异常通知");
        }
        finally
        {
            System.out.println("我是 [环绕通知]的 最终通知");
        }

        return  result;
    }
}
