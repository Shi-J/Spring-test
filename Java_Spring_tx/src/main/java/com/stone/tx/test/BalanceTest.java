package com.stone.tx.test;

import com.stone.tx.servlet.BalanceController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

public class BalanceTest
{

    ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");


    @Test
    public void test01()throws FileNotFoundException

    {
        BalanceController bean = ioc.getBean(BalanceController.class);
        bean.updateBalance("zs", 100, "ls");
    }
}