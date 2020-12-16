package com.gwf.yuhuangshe.controllerImpl;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.controller.LoginController;
import com.gwf.yuhuangshe.entity.User;
import com.gwf.yuhuangshe.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@ResponseBody
public class LoginControllerImpl implements LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("/login")
    public JSONObject login(User user){
        return loginService.login(user);
    }
}
