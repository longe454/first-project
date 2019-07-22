package com.zhiyou100.java20;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.zhiyou100")
@MapperScan("com.zhiyou100.mapper")
public class Java20Application {

    public static void main(String[] args) {
        SpringApplication.run(Java20Application.class, args);
    }

}
