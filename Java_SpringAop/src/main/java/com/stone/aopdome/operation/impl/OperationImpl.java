package com.stone.aopdome.operation.impl;

import com.stone.aopdome.operation.Operation;
import org.springframework.stereotype.Component;

@Component
public class OperationImpl implements Operation
{
    @Override
    public double add(double i, double j)
    {
        return i+j;
    }

    @Override
    public double subtract(double i, double j)
    {
        return i-j;
    }

    @Override
    public double mul(double i, double j)
    {
        return i*j;
    }

    @Override
    public double div(double i, double j)
    {
        return i/j;
    }
}
