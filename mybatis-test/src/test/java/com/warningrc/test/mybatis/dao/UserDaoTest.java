package com.warningrc.test.mybatis.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.warningrc.test.mybatis.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserDaoTest {

    /**
     * Logger for UserDaoTest
     */
    private static final Logger logger = LoggerFactory.getLogger(UserDaoTest.class);


    @Autowired
    private UserDao userDao;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testGetUserById() {
        logger.info("getUserById({})-->{}", 1, userDao.getUserById(1));
        logger.info("getAllUser()-->{}", userDao.getAllUser());
    }

}
