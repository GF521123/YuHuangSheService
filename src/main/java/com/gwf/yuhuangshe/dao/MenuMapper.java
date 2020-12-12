package com.gwf.yuhuangshe.dao;

import com.gwf.yuhuangshe.entity.Menu;

import java.util.List;

public interface MenuMapper {
    List<Menu> selMenu();
    int insertMenu(Menu ment);
    int updateMenu(Menu menu);
}
