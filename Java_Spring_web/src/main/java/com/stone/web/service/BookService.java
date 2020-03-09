package com.stone.web.service;

import com.stone.web.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService
{
    @Autowired
    public BookDao bookDao;

    public void addBooK(){
        bookDao.addBook();
        System.out.println("BookService准备添加图书");
    }
}
