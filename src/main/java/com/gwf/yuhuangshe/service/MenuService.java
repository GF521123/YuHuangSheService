package com.gwf.yuhuangshe.service;

import com.alibaba.fastjson.JSONObject;

public interface MenuService {
    public JSONObject selMenu();
    public JSONObject selMenuById(int MId);
    public JSONObject insertMenu();
    public JSONObject updateMenu();
}
