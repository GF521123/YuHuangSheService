package com.gwf.yuhuangshe.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gwf.yuhuangshe.entity.Menu;
import com.gwf.yuhuangshe.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import com.gwf.yuhuangshe.dao.MenuMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> MenuInitGet(Integer userid){
        JSONObject resultJson = new JSONObject();
        userid = 1;
        List<Menu> Menuone = menuMapper.menuone(userid);
        for (Menu menu : Menuone) {
            List<Menu> Menutwo = menuMapper.menutwo(userid,menu);
            menu.setMenu(Menutwo);
        }
        return Menuone;
    }
    public JSONObject selMenus(int page, int pageSize){

        JSONObject resultJson = new JSONObject();
        PageHelper.startPage(page, pageSize);

        List<Menu> menuList = menuMapper.selMenus();
        PageInfo<Menu> pageInfo = new PageInfo<>(menuList);
//        return pageInfo;

        resultJson.put("toal",pageInfo.getTotal());
        resultJson.put("rows",pageInfo.getList());
        return resultJson;
    }
}
