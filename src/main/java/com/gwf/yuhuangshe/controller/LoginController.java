package com.gwf.yuhuangshe.controller;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.User;

public interface LoginController {
    public JSONObject login(User user);
}
