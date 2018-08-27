package com.example.Controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@PropertySource("classpath:webapp/resources/WEB-INF/message/base_en.properties")
public class HomePageController {

    @Value("${home.page.hello.demo}")
    private String demo;


    @RequestMapping("/")
    public String hello(){
        return demo;
    }

}
