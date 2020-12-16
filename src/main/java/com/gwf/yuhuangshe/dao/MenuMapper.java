package com.gwf.yuhuangshe.dao;

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
}
