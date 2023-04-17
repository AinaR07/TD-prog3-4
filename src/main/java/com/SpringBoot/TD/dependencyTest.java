package com.SpringBoot.TD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.SpringBoot")

public class dependencyTest {
    public static void main(String[] args) {
        SpringApplication.run(TdApplication.class, args);
    }
}
