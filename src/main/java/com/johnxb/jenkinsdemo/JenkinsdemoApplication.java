package com.johnxb.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsdemoApplication.class, args);
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String Hello() {
        return "hello";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String Test() {
        return "test";
    }
}
