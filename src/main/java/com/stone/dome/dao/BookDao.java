package com.stone.dome.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BookDao
{

    public void saveBook(){
        System.out.println(" BookDao  --- > 图书成功");
    }

}
