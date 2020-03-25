package com.hr.consumer.service;

import com.hr.consumer.service.fallback.TestFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "cloud-provider",fallback = TestFallBack.class)
public interface FeiginService {

    @GetMapping(value = "/say/{str}")
    public String say(@PathVariable String str);
}
