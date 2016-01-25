package com.warningrc.test.mybatis;

import org.springframework.stereotype.Service;

@Service
public class FOrderServiceImpl implements OrderService {

    @Override
    public int getOrder() {
        return 10;
    }

    @Override
    public String getName() {
        return "F";
    }

}
