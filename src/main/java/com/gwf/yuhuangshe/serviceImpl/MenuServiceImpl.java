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
    public JSONObject selMenu(){
        List<Menu> restMenusList = menuMapper.selMenu();
        JSONObject resultJson = new JSONObject();
        resultJson.put("rows",restMenusList);
        resultJson.put("total",menuMapper.selMenuNum());

        return resultJson;
    }

    public JSONObject selMenuPage(int pageSize,int pageNumber){
        PageHelper.startPage(pageSize/pageNumber+1,pageNumber);
        List<Menu> restMenusList = menuMapper.selMenuPage();
        for(int i=0;i<restMenusList.size();i++){
            System.out.println(restMenusList.get(i).toString());
        }
        PageInfo pageInfo = new PageInfo(restMenusList);
        JSONObject resultJson = new JSONObject();
        resultJson.put("rows",pageInfo.getList());
        resultJson.put("total",menuMapper.selMenuNum());
        return resultJson;
    }

    @Override
    public JSONObject selMenuById(int MId) {
        List<Menu> menuList = menuMapper.selMenu();
//        if()
        return null;
    }

    @Override
    public JSONObject delMenuById(int MId) {
        int rest = menuMapper.delMenuById( MId);
        JSONObject resultJson = new JSONObject();
        resultJson.put("code",0);
        if(rest == 1) {
            resultJson.put("msg", "删除成功");
        }else{
            resultJson.put("msg", "删除失败");
        }
        return resultJson;
    }

    @Override
    public JSONObject insertMenu(Menu menu) {
        int restValue = menuMapper.insertMenu(menu);
        return null;
    }

    @Override
    public JSONObject updateMenu(Menu menu) {
        int restValue = menuMapper.updateMenu(menu);
        return null;
    }

}
