package com.gwf.yuhuangshe.service;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.Menu;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface MenuService {
    /*
     * 系统菜单加载 查询菜单
     */
    public List<Menu> MenuInitGet(@RequestParam("userid")Integer userid);
    /*
     * 查询menu菜单
     */
    public JSONObject selMenus(Integer page, Integer pageSize);

    /*
     * 根据menu的id删除菜单
     */
    public JSONObject delMenuById( Menu menu);

    /*
     * 根据menu的id修改菜单
     */
    public JSONObject UpdateMenuById( Menu menu);
}
