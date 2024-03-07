package com.example.springsecuritytest.contraller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SecurityController {
    @RequestMapping("/add")
    public String add(){
        return "1";
    }
}
