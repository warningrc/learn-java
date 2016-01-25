package com.warningrc.test.mybatis;

import org.springframework.stereotype.Service;

@Service
public class TOrderServiceImpl implements OrderService {

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public String getName() {
        return "T";
    }

}
