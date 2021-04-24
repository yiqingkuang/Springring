package com.minmin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller

@RestController
//RestController 是上面两个的合体
public class HelloController {
    @RequestMapping("/hello")
    public String  handle01(){
        return "Hello,Spring Boot 2!";
    }
}
