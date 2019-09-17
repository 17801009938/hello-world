package com.jk.cotroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestColltroller {

    @Value("${server.port}")
    private String port;

    @RequestMapping("testPort")
    public String toTest(String name){
        return "name: "+name+"port: "+port;
    }

}
