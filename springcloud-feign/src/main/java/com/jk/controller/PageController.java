package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("toMain")
    public String toMain(){
        return "main";
    }
    @RequestMapping("todetails")
    public String todetails(){
        return "details";
    }
    @RequestMapping("t")
    public String t(){
        return "qiantai";
    }
}
