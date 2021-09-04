package com.bilibili;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class SpringBootLeiShen01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLeiShen01Application.class, args);
    }

}
