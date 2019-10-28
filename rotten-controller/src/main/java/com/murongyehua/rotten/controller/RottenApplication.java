package com.murongyehua.rotten.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author liul
 */
@SpringBootApplication
@ComponentScan({"com.murongyehua.rotten.biz","com.murongyehua.rotten.controller","com.murongyehua.rotten.dao"})
@MapperScan({"com.murongyehua.rotten.dao"})
public class RottenApplication {

    public static void main(String[] args) {
        SpringApplication.run(RottenApplication.class, args);
    }

}
