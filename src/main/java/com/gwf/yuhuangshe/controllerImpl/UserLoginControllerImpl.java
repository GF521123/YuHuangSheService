package com.gwf.yuhuangshe.controllerImpl;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.controller.UserLoginController;
import com.gwf.yuhuangshe.entity.User;
import com.gwf.yuhuangshe.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@ResponseBody
public class UserLoginControllerImpl implements UserLoginController {
    @Autowired
    private UserLoginService loginService;

    @RequestMapping("/login")
    public JSONObject login(HttpServletRequest request, User user){
        return loginService.login(request,user);
    }
    @RequestMapping("/logout")
    public JSONObject logout(HttpServletRequest request){
        return loginService.logout(request);
    }
    @RequestMapping("/getLoginUser")
    public JSONObject getLoginUser(HttpServletRequest request){
        return loginService.getLoginUser( request);
    }
}
