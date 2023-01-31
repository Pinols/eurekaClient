package com.example.feignclient.feigneureka;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("microserviceone")
public interface feigneureka {
    
    @RequestMapping("/api/v1/test")
    String getTest();
    
    
}
