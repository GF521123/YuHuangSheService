package com.gwf.yuhuangshe.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gwf.yuhuangshe.service.MenuService;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("/selMenu")
    @ResponseBody
    public JSONObject selMenu(){
        return menuService.selMenu();
    }

    @RequestMapping("/selMenu")
    @ResponseBody
    public JSONObject selMenuById(int MId){
        return menuService.selMenuById(MId);
    }
}
