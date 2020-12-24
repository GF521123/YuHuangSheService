package com.gwf.yuhuangshe.controller;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.Menu;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface MenuController {
    /*
     * 系统菜单加载 查询菜单
     */
    public List<Menu> MenuInitGet(@RequestParam("userid")Integer userid);
    /*
     * 查询menu菜单
     */
    public JSONObject selMenus( Integer page,Integer pageSize);
    /*
     * 根据menu的id删除菜单
     */
    public JSONObject delMenuById( Menu menu);

    /*
     * 根据menu的id修改菜单
     */
    public JSONObject UpdateMenuById( Menu menu);
}
