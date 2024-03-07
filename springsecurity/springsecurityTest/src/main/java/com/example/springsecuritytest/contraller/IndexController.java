package com.example.springsecuritytest.contraller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    @GetMapping("/index")
    public String index(){
        return "login";
    }

    @GetMapping("/main")
    public String success(){
        return "main";
    }

}
