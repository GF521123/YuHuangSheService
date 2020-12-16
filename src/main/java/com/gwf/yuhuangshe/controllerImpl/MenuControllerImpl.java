package com.gwf.yuhuangshe.controllerImpl;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.controller.MenuController;
import com.gwf.yuhuangshe.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gwf.yuhuangshe.service.MenuService;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MenuControllerImpl implements MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("/selMenu")
    @ResponseBody
    public JSONObject selMenu(){
        return menuService.selMenu();
    }

    @RequestMapping("/selMenuById")
    @ResponseBody
    public JSONObject selMenuById(int MId){
        return menuService.selMenuById(MId);
    }

    @Override
    @RequestMapping("/delMenuById")
    @ResponseBody
    public JSONObject delMenuById(int MId) {
        return menuService.delMenuById(MId);
    }

    @RequestMapping("/selMenuPage")
    @ResponseBody
    public JSONObject selMenuPage(int pageSize,int pageNumber){
        return menuService.selMenuPage( pageSize, pageNumber);
    }

    @Override
    @RequestMapping("/insertMenu")
    @ResponseBody
    public JSONObject insertMenu(Menu menu) {
        return menuService.insertMenu(menu);
    }

    @Override
    @RequestMapping("/updateMenu")
    @ResponseBody
    public JSONObject updateMenu(Menu menu) {
        return menuService.updateMenu(menu);
    }
}
