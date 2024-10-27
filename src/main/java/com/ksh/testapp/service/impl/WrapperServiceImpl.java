package com.ksh.testapp.service.impl;

import com.ksh.testapp.service.WrapperService;
import com.ksh.testapp.wrapper.ValueWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WrapperServiceImpl<T extends Number> implements WrapperService<T> {

    private final ValueWrapper<T> wrapper;

    @Autowired
    public WrapperServiceImpl(ValueWrapper<T> wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void print() {
        wrapper.print();
    }
}
