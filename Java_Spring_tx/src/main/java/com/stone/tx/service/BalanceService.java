package com.stone.tx.service;

import com.stone.tx.dao.BalanceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
public class BalanceService
{
    @Autowired
    private BalanceDao balanceDao;

    public void updateBalance(String name1 , double price,String name2)throws FileNotFoundException
    {
        balanceDao.updateBalance( name1 , price, name2);
    }


}
