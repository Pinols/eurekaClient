package com.example.feignclient.feigneureka;

import com.example.feignclient.MyHhazel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    
    @Autowired
    feigneureka feigneureka;
    @Autowired
    MyHhazel hazel;

    @RequestMapping("/get-test")
    public String greeting() {
        return feigneureka.getTest();
    }
    
    @RequestMapping("/test-cache")
    public String cache(){
        return hazel.method();
    }
    
}
