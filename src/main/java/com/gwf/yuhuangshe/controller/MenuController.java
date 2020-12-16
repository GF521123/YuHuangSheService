package com.gwf.yuhuangshe.controller;

import com.alibaba.fastjson.JSONObject;

public interface MenuController {
    public JSONObject selMenu();
    public JSONObject selMenuById(int MId);
    public JSONObject delMenuById(int MId);
}
