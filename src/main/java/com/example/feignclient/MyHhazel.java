package com.example.feignclient;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MyHhazel {
    
    @Cacheable("item")
    public String method() {
        return method2();
    }
    
    public String method2() {
        try{
            Thread.sleep(3000);
        }catch (Exception e){}
        
        return "ok cache";
    }
    
}
