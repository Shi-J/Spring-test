package com.stone.dome.service;

import com.stone.dome.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookService1")
//@Service
public class BookService
{
        @Autowired
        private BookDao bookDao;

        public void saveBook(){
            System.out.println(" BookService  --- >图书正再添加...");
            bookDao.saveBook();
        }
}
