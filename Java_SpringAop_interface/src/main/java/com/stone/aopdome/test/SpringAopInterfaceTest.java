package com.stone.aopdome.test;

import com.stone.aopdome.operation.Operation;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopInterfaceTest
{
    ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void testAopInterface1(){
        Operation bean = ioc.getBean(Operation.class);
        double add = bean.add(1, 3);
        System.out.println(add);
    }
}
