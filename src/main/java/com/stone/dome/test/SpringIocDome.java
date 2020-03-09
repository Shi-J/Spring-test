package com.stone.dome.test;

import com.stone.dome.model.Person;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class SpringIocDome
{

    private  ApplicationContext ioc= new ClassPathXmlApplicationContext("ioc.xml");
    @Test
    public void test1(){
        Person person=new Person("zs","男",23);
        System.out.println(person);
    }

    @Test
    public void testIoc1(){
        //  1.获取容器
        ApplicationContext ioc= new ClassPathXmlApplicationContext("ioc.xml");
        //  2.获取bean
        Person person=(Person) ioc.getBean("person1");
        System.out.println(person);
    }

    @Test
    public void testIoc2(){
        //  2.获取bean
        Person person= ioc.getBean(Person.class);
        System.out.println(person);
    }

    @Test
    public void testIoc3(){
        //  2.获取bean
        Person person= ioc.getBean("person2",Person.class);

        System.out.println(person);
    }

    @Test
    public void testIoc4(){
        //  2.获取bean
        Person person= ioc.getBean("person4",Person.class);
        System.out.println(person);
    }

    @Test
    public void testIoc5(){
        //  2.获取bean
        Person person= ioc.getBean("person5",Person.class);
        System.out.println(person);
    }

    @Test
    public void testIocjdbc(){
        //  2.获取bean
        DataSource bean = ioc.getBean(DataSource.class);
        System.out.println(bean);

    }


}
