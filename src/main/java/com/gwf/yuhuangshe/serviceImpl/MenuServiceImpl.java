package com.gwf.yuhuangshe.serviceImpl;

import com.alibaba.fastjson.JSONObject;
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
    public JSONObject selMenu(int pageSize,int pageNumber){
        List<Menu> restMenusList = menuMapper.selMenu();
        JSONObject resultJson = new JSONObject();
//        resultJson.put("code",0);
        resultJson.put("total",restMenusList.size());
        resultJson.put("rows",restMenusList);

        return resultJson;
    }

    @Override
    public JSONObject selMenuById(int MId) {
        List<Menu> menuList = menuMapper.selMenu();
//        if()
        return null;
    }

    @Override
    public JSONObject insertMenu() {
        return null;
    }

    @Override
    public JSONObject updateMenu() {
        return null;
    }

}
