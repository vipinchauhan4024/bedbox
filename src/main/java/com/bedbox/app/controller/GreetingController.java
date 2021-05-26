package com.bedbox.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@RequestMapping("api/")
public class GreetingController {

    @GetMapping(value = "/greeting")  
    public String getGreeting()   
    {  
     return "Hello Service is running Ok " ;
    }  
}
