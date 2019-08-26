package com.johnxb.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsdemoApplication.class, args);
    }

    @RequestMapping
    public String Hello() {
        return "hello";
    }

    @RequestMapping
    public String Test() {
        return "test";
    }
}
