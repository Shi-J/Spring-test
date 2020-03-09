package com.stone.aopdome.operation;

import org.springframework.stereotype.Component;

@Component
public interface Operation
{
    //  加法
     double add(double i,double j);
    //  减法
     double subtract(double i,double j);
    //  乘法
     double mul(double i,double j);
    //  除法
      double div(double i,double j);
}
