package com.stone.dome.test;

import com.stone.dome.dao.BookDao;
import com.stone.dome.servlet.BookServlet;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocDome2
{
    private ApplicationContext ioc =new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void  test1(){
        BookDao bookDao = ioc.getBean("bookDao1", BookDao.class);

        BookDao bookDao2 = ioc.getBean("bookDao1", BookDao.class);

        System.out.println(bookDao == bookDao2);
    }

    @Test
    public  void test2(){
        BookServlet bookServlet = ioc.getBean("bookServlet", BookServlet.class);
        bookServlet.saveBook();

    }
}
