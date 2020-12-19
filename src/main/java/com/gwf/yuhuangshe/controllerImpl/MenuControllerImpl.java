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
    public List<Menu> showmenu(@RequestParam("userid")Integer userid){
        List<Menu> Menuone = menuService.menuone(userid);
        for (Menu menu : Menuone) {
            List<Menu> Menutwo = menuService.menutwo(userid,menu);
            menu.setMenu(Menutwo);
        }
        return Menuone;
    }
}