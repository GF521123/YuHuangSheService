package com.gwf.yuhuangshe.controller;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.Menu;

public interface MenuController {
    public JSONObject selMenu();//查询全部，后期取消
    public JSONObject selMenuById(int MId);//根据id查询
    public JSONObject delMenuById(int MId);//根据id删除
    public JSONObject selMenuPage(int pageSize,int pageNumber);//分页查询
    public JSONObject insertMenu(Menu menu);//新建
    public JSONObject updateMenu(Menu menu);//修改
}
