package com.wst.wstfoodsever.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWord {

    @RequestMapping("/hello")
    public void hello(){
        System.out.println("hello world");
    }
}
