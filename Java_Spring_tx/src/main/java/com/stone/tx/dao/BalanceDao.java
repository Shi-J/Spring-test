package com.stone.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Repository
public class BalanceDao
{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Transactional
    public void updateBalance(String name1 , double price,String name2) throws FileNotFoundException
    {
        //  减少余额
        String sql1="update balance set price = price - ? where name= ?";
        jdbcTemplate.update(sql1,price,name1);
        System.out.println(1/0);
        //  添加余额
        String sql2="update balance set price = price + ? where name= ?";
        jdbcTemplate.update(sql2,price,name2);




    }


}
