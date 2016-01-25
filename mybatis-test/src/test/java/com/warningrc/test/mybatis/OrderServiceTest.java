package com.warningrc.test.mybatis;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class OrderServiceTest {
    @Autowired
    private List<OrderService> orderServices;

    @Test
    public void testName() throws Exception {
        System.out.println(orderServices);
    }
}
