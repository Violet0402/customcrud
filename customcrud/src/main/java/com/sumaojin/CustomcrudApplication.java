package com.sumaojin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sumaojin.dao")
public class CustomcrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomcrudApplication.class, args);
    }

}
