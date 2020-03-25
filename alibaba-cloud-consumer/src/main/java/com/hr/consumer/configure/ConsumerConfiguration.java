package com.hr.consumer.configure;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Configurable
@Component
public class ConsumerConfiguration {

    /**
     * <bean id="restTemplate" class="org.springframework.web.client.RestTemplate" />
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
