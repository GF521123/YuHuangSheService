package com.gwf.yuhuangshe.dao;

import com.gwf.yuhuangshe.entity.Menu;

import java.util.List;

public interface MenuMapper {
    List<Menu> selMenu();
    List<Menu> selMenuById(int MId);
    int insertMenu(Menu ment);
    int updateMenu(Menu menu);
}
