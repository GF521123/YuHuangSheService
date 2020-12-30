package com.gwf.yuhuangshe.service;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.User;

import javax.servlet.http.HttpServletRequest;

public interface UserLoginService {
    public JSONObject login(HttpServletRequest request, User user);
}
