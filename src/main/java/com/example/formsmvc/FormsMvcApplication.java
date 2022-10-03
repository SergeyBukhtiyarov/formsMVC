package com.example.formsmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FormsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(FormsMvcApplication.class, args);
    }

}
