package com.dbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.dbt")
public class UCFApplication {

    public static void main(String[] args) {
        SpringApplication.run(UCFApplication.class, args);
    }

}
