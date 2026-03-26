package com.rhattoxcodingstudies.usermanager;

import org.springframework.boot.SpringApplication;

public class TestUserManagerApplication {

    public static void main(String[] args) {
        SpringApplication.from(UserManagerApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
