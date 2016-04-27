package com.warningrc.test.antlr4;

import java.util.List;

import lombok.Data;

@Data
public class Order {

    private String orderNo;

    private List<Course> courses;
}
