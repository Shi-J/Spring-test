package com.stone.dome.servlet;


import com.stone.dome.service.BookService;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;


@Controller
public class BookServlet
{

    @Inject
    private BookService bookService;

    public void saveBook(){
        bookService.saveBook();
    }
}
