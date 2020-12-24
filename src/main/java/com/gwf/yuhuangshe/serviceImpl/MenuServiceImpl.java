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
    public JSONObject selMenus(Integer page, Integer pageSize){
        System.out.println(page+" "+pageSize);
        JSONObject resultJson = new JSONObject();
        PageHelper.startPage(page, pageSize);

        List<Menu> menuList = menuMapper.selMenus();
        PageInfo<Menu> pageInfo = new PageInfo<>(menuList);
//        return pageInfo;

        resultJson.put("total",pageInfo.getTotal());
        resultJson.put("rows",pageInfo.getList());
        return resultJson;
    }
    public JSONObject delMenuById( Menu menu){
        JSONObject resultJson = new JSONObject();
        int resultDel = menuMapper.delMenuById( menu);
        System.out.println(resultDel);
        resultJson.put("code",0);
        if(resultDel == 1){
            resultJson.put("msg","删除成功");
        }else{
            resultJson.put("msg","删除失败");
        }
        return resultJson;
    }
}
