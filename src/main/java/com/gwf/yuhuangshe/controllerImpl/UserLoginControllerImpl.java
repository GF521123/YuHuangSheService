package com.gwf.yuhuangshe.controllerImpl;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.controller.UserLoginController;
import com.gwf.yuhuangshe.entity.User;
import com.gwf.yuhuangshe.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@ResponseBody
public class UserLoginControllerImpl implements UserLoginController {
    @Autowired
    private UserLoginService loginService;
    @RequestMapping("/login")
    public JSONObject login(User user){
        return loginService.login(user);
    }
}
