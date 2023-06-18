package com.example.worktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.worktest.controller")
@ComponentScan("com.example.worktest.service.impl")
@ComponentScan("com.example.worktest.dao")
public class WorktestApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorktestApplication.class, args);
    }

}
