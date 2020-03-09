package com.stone.aopdome.test;

import com.stone.aopdome.operation.Operation;
import com.stone.aopdome.operation.impl.OperationImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopTest
{
    private ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void testaop1(){
        Operation bean = ioc.getBean(Operation.class);
        double add = bean.div(12.0, 0);
        System.out.println(add);
    }

    // 测试环绕通知
    @Test
    public void testaop2(){
        Operation bean = ioc.getBean(Operation.class);

        double subtract = bean.div(56.0, 0);

        System.out.println(subtract);
    }
}
