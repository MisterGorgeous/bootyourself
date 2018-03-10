package com.slobo.bootyorself.web.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }
}