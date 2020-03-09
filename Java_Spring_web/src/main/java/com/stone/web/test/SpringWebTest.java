package com.stone.web.test;

import com.stone.web.servlet.BookController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringWebTest
{
     ApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

     @Test
     public void test(){
          BookController bean = ioc.getBean(BookController.class);
          bean.addBook();

     }
}
