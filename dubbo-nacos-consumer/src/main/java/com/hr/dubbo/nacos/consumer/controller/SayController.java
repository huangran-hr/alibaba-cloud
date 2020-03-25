package com.hr.dubbo.nacos.consumer.controller;

import com.hr.dubbo.nacos.provider.api.SayService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayController {

    @Reference
    public SayService sayService;

    @GetMapping("/say/{str}")
    public String say(@PathVariable String str){
        return sayService.say(str);
    }
}
