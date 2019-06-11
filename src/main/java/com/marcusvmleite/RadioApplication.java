package com.marcusvmleite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.marcusvmleite")
public class RadioApplication {

    public static void main(String[] args) {
        SpringApplication.run(RadioApplication.class, args);
    }

}
