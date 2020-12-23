package com.gwf.yuhuangshe.controllerImpl;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.controller.MenuController;
import com.gwf.yuhuangshe.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gwf.yuhuangshe.service.MenuService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MenuControllerImpl implements MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("/AllMenu")
    @ResponseBody
    public List<Menu> MenuInitGet(@RequestParam("userid")Integer userid){
        return menuService.MenuInitGet(userid);
    }
}
