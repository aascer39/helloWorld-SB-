package com.zjj.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("返回一次Hello World!");
        return "Hello World!";
    }
}
