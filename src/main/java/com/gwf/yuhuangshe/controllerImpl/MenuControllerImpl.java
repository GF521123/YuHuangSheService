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

    /*
     * 系统菜单加载 查询菜单
     */
    @RequestMapping("/AllMenu")
    @ResponseBody
    public List<Menu> MenuInitGet(@RequestParam("userid")Integer userid){
        return menuService.MenuInitGet(userid);
    }
    /*
     * 查询menu菜单
     */
    @RequestMapping("/selMenus")
    @ResponseBody
    public JSONObject selMenus(Integer page, Integer pageSize){return menuService.selMenus(page,pageSize);}

    /*
     * 根据menu的id删除菜单
     */
    @RequestMapping("/delMenuById")
    @ResponseBody
    public JSONObject delMenuById( Menu menu){
        return menuService.delMenuById( menu);
    }

    /*
     * 根据menu的id修改菜单
     */
    @RequestMapping("/updateMenuById")
    @ResponseBody
    public JSONObject UpdateMenuById( Menu menu){
        return menuService.UpdateMenuById( menu);
    }
    /*
     * menu 增加
     */
    @RequestMapping("/insertMenu")
    @ResponseBody
    public JSONObject InsertMenuById( Menu menu){
        return menuService.InsertMenuById( menu);
    }
}
