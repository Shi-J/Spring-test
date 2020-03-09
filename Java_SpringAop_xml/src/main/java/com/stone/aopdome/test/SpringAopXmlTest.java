package com.stone.aopdome.test;

import com.stone.aopdome.operation.Operation;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopXmlTest
{
    ApplicationContext ioc =new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public  void testAopXml1(){
        Operation operation = ioc.getBean("operation", Operation.class);
        double add = operation.add(1, 2);
        System.out.println("运算结果 ： "+ add);

    }
}
