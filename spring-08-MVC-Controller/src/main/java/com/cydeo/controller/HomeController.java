package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "home.html";
    }

    @RequestMapping("/luka")
    public String home2(){
        return "home.html";
    }

    @RequestMapping
    public String home3(){
        return "home.html";
    }
    @RequestMapping({"/apple", "/orange"})
    public String home4(){
        return "home.html";
    }

}
