package com.gwf.yuhuangshe.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuService {
    public JSONObject selMenu();
    public JSONObject selMenuById(int MId);
    public JSONObject insertMenu();
    public JSONObject updateMenu();
    public JSONObject selMenuPage(int pageSize,int pageNumber);
}
