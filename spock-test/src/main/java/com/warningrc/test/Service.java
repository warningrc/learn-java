package com.warningrc.test;

public class Service {

    public String name(String name) {
        if (name == null) {
            return "";
        } else {
            return name + "--name";
        }
    }
}
