package com.example.springsecuritytest.contraller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UsersController {
    @GetMapping("/findAll")
    public String findAll(){
        return "findAll";
    }

    @GetMapping("/anno")
    public String anno(){
        return "不需要认证可以访问";
    }


}
