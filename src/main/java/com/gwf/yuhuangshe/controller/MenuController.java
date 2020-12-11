package com.gwf.yuhuangshe.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gwf.yuhuangshe.service.MenuService;
@Controller
public class MenuController {
    @Autowired
    private MenuService menuService;
    @RequestMapping("/selMenu")
    public JSONObject selMenu(){
        return menuService.selMenu();
    }
}
