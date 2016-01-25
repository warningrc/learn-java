package com.google.gson;

import junit.framework.Assert;
import lombok.Data;
import lombok.experimental.Builder;

import org.junit.Test;

import com.google.gson.annotations.Since;

public class GsonTest {

    @Data
    @Builder
    static class User {

        @Since(1.0)
        private long id;

        @Since(1.1)
        private String name;

        @Since(1.2)
        private int age;

    }

    @Test
    public void testSince() throws Exception {
        User user = new User.UserBuilder().id(123456L).name("warning").age(25).build();
        Gson gson = new GsonBuilder().setVersion(1.0).create();
        Assert.assertEquals("{\"id\":123456}", gson.toJson(user));
        gson = new GsonBuilder().setVersion(1.1).create();
        Assert.assertEquals("{\"id\":123456,\"name\":\"warning\"}", gson.toJson(user));
        gson = new GsonBuilder().setVersion(1.2).create();
        Assert.assertEquals("{\"id\":123456,\"name\":\"warning\",\"age\":25}", gson.toJson(user));
        gson = new Gson();
        Assert.assertEquals("{\"id\":123456,\"name\":\"warning\",\"age\":25}", gson.toJson(user));
    }
}
