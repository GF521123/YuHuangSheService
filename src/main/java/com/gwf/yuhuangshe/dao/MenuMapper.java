package com.gwf.yuhuangshe.dao;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface MenuMapper {
    /*
     * 一级标签 根据userid查询一级菜单
     * 再根据 userid 和一级标签 查询除对应的二级标签
     */
    List<Menu> menuone(@Param("userid")Integer userid);
    List<Menu> menutwo(@Param("userid") Integer userid, @Param("Menuone")Menu Menuone);
    /*
     * 查询menu菜单
     */
    List<Menu> selMenus();
    int delMenuById( Menu menu);
}
