package com.hr.consumer.controller;

import com.hr.consumer.service.FeiginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestFeiginController {

    @Value("${user.name}")
    private String userName;

    @Autowired
    private FeiginService feiginService;

    @GetMapping(value = "/feigin/say/{str}")
    public  String say(@PathVariable String str){
        return feiginService.say(str);
    }

    @GetMapping(value = "/name")
    public String getName(){
        return userName;
    }
}
