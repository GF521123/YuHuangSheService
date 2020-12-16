package com.gwf.yuhuangshe.dao;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.Menu;

import java.util.List;
public interface MenuMapper {
    List<Menu> selMenu();

    List<Menu> selMenuById(int MId);

    List<Menu> selMenuPage();

    int insertMenu(Menu ment);

    int updateMenu(Menu menu);

    /*
     * 返回总条数
     */
    int selMenuNum();

    /*
     * 根据Id删除
     */
    int delMenuById(int MId);
}
