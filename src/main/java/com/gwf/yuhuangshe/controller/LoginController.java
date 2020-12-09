package com.gwf.yuhuangshe.controller;

import com.gwf.yuhuangshe.entity.User;
import com.gwf.yuhuangshe.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@ResponseBody
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("/login")
    public void login(User user){
        System.out.println(user.getUName());
//        System.out.println(user.getUPasswd());
        loginService.login(user);
    }
}
