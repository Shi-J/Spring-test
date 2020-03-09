package com.stone.aopdome.proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.sql.Array;
import java.util.Arrays;

public class OperationProxy
{
    public void logbefore(JoinPoint joinPoint){
        System.out.println("我是前置通知，目标方法名"+joinPoint.getSignature().getName()+
                "\t目标方法的参数个数"+joinPoint.getArgs().length+
                "\t参数列表 "+ Arrays.asList(joinPoint.getArgs())
                );
    }
    public void logAfter(JoinPoint joinPoint){
        System.out.println("我是后置通知，目标方法名"+joinPoint.getSignature().getName()+
                "\t目标方法的参数个数"+joinPoint.getArgs().length+
                "\t参数列表 "+ Arrays.asList(joinPoint.getArgs())
        );
    }

    public void logException(JoinPoint joinPoint,Exception e){
        System.out.println("我是异常通知，目标方法名"+joinPoint.getSignature().getName()+
                "\t目标方法的参数个数"+joinPoint.getArgs().length+
                "\t参数列表 "+ Arrays.asList(joinPoint.getArgs())+
                "\t目标异常 "+e
        );
    }
    public void logFinal(JoinPoint joinPoint,Object result){
        System.out.println("我是最置通知，目标方法名"+joinPoint.getSignature().getName()+
                "\t目标方法的参数个数"+joinPoint.getArgs().length+
                "\t参数列表 "+ Arrays.asList(joinPoint.getArgs())+
                "\t目标方法的返回值"+result
        );
    }


    public Object logAround(ProceedingJoinPoint pjp) throws Throwable
    {
        Object result = null;

        try
        {
            System.out.println("环绕通知模拟的【前置通知】");
            result  = pjp.proceed(); //控制着目标方法的执行，相当于目标方法是否执行，该方法的返回值就是目标方法得到返回值
//            System.out.println(1 /0 );
            System.out.println("环绕通知模拟的【后置通知】 方法的返回值为  "+result+"\t目标方法"+pjp.getSignature().getName()+"\t参数个数 "+pjp.getArgs().length);
        }
        catch (Exception e)
        {
            System.out.println("环绕通知模拟的【异常置通知】"+e);
        }
        finally
        {
            System.out.println("环绕通知模拟的【最终置通知】");
        }
        return result;
    }
}
