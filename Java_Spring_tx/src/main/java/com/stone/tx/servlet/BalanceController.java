package com.stone.tx.servlet;

import com.stone.tx.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.FileNotFoundException;

@Controller
public class BalanceController
{
    @Autowired
    private BalanceService balanceService;

    public void updateBalance(String name1 , double price,String name2) throws FileNotFoundException
    {
        balanceService.updateBalance( name1 , price, name2);
    }
}
