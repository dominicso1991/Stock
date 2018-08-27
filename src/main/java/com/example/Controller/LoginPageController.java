package com.example.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginPageController {

    @RequestMapping("/login")
    public String loginPage(){
        return "demo";
    }

    @RequestMapping("/login/success")
    public String loginSuccess(){

        return "index";
    }
}
