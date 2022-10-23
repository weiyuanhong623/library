package com.zhang.librarytest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhang.librarytest.dao")
//接口所在包
public class LibraryTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryTestApplication.class, args);
    }

}
