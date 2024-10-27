package com.ksh.testapp.wrapper.impl;

import com.ksh.testapp.wrapper.ValueWrapper;
import org.springframework.stereotype.Component;

@Component
public class DoubleWrapper implements ValueWrapper<Double> {

    @Override
    public void print() {
        System.out.println("Double wrapper");
    }
}
