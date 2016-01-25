package com.warningrc.test.mybatis;

import org.springframework.stereotype.Service;

@Service
public class SOrderServiceImpl implements OrderService {

    @Override
    public int getOrder() {
        return 2;
    }

    @Override
    public String getName() {
        return "S";
    }

}
