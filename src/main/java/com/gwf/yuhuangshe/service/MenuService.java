package com.gwf.yuhuangshe.service;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.Menu;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuService {
    public JSONObject selMenu();
    public JSONObject selMenuById(int MId);
    public JSONObject delMenuById(int MId);
    public JSONObject insertMenu(Menu menu);
    public JSONObject updateMenu(Menu menu);
    public JSONObject selMenuPage(int pageSize,int pageNumber);
}
