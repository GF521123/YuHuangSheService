package com.gwf.yuhuangshe.controller;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.User;

public interface UserLoginController {
    public JSONObject login(User user);
}
