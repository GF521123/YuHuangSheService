package com.gwf.yuhuangshe.controller;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.User;

import javax.servlet.http.HttpServletRequest;

public interface UserLoginController {
    public JSONObject login(HttpServletRequest request, User user);
}
