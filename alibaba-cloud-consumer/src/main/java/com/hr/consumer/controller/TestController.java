package com.hr.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    private final RestTemplate restTemplate;

    @Autowired
    public TestController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @GetMapping(value="/echo/{str}")
    public String say(@PathVariable  String str){
        return restTemplate.getForObject("http://cloud-provider/say/"+str,String.class);
    }

}
