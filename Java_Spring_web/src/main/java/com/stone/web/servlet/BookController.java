package com.stone.web.servlet;

import com.stone.web.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController
{
    @Autowired
    public BookService bookService;
    public void addBook(){
        bookService.addBooK();
    }

}
