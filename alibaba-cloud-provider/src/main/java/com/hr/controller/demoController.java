package com.hr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/say/{str}")
    public String sayHello(@PathVariable String str){
        return "hello alibaba cloud nacos port:" + port + " "+ str;
    }
}
