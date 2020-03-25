package com.hr.dubbo.nacos.provider.service;

import com.hr.dubbo.nacos.provider.api.SayService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class SayServiceImpl implements SayService {

    @Override
    public String say(String str) {
        return " hello dubbo nacos ";
    }
}
