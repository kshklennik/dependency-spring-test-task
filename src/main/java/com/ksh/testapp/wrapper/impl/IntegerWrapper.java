package com.ksh.testapp.wrapper.impl;

import com.ksh.testapp.wrapper.ValueWrapper;
import org.springframework.stereotype.Component;

@Component
public class IntegerWrapper implements ValueWrapper<Integer> {

    @Override
    public void print() {
        System.out.println("Integer wrapper");
    }
}
