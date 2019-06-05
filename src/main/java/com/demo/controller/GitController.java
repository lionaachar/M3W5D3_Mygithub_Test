package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("gittest")
public class GitController {

    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
        System.out.println("hello github");
        system.out.println("this is a apple");
        return "hello";
    }

}
