package com.stone.web.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BookDao
{
    public void addBook(){
        System.out.println("BookDao正在添加图书");
    }
}
