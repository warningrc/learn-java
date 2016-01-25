package com.warningrc.test.mybatis.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * The Class User.
 *
 * @author <a href="http://blog.warningrc.com">王宁</a><br>
 *         <b>date</b>: 2015-3-11
 */
@Data
public class User implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private long userId;
    private String userName;
    private int userAge;
}
