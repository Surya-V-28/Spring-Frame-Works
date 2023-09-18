package com.exampleauth.oauth2as.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {


    @GetMapping("/")
    public String greet() {
        return "wecome";
    }

    @GetMapping("/secured")
    public  String secured() {
        return "Hello Secured";
    }

}
