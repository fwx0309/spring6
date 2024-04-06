package org.fwx.bean;

import org.springframework.stereotype.Component;

@Component
public class User {
    public User() {
        System.out.println("run user");
    }
}