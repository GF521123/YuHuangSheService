package com.gwf.yuhuangshe.service;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.User;

public interface LoginService {
    public JSONObject login(User user);
}
