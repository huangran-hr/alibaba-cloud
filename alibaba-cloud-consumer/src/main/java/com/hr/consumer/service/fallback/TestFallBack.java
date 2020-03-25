package com.hr.consumer.service.fallback;

import com.hr.consumer.service.FeiginService;
import org.springframework.stereotype.Component;

@Component
public class TestFallBack implements FeiginService {

    @Override
    public String say(String str) {
        return "服务异常";
    }
}
