package com.gwf.yuhuangshe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class LoginController {

    @RequestMapping("/login")
    public void login(){
        System.out.println("sadfaf");
//        return "adfa";
    }
}
