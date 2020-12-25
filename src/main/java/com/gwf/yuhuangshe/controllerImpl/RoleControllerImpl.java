package com.gwf.yuhuangshe.controllerImpl;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.controller.RoleController;
import com.gwf.yuhuangshe.entity.Role;
import com.gwf.yuhuangshe.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RoleControllerImpl implements RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/selRoles")
    @ResponseBody
    @Override
    public JSONObject selRoles(Integer page, Integer pageSize) {
        return roleService.selRoles(page,pageSize);
    }

    @RequestMapping("/insertRole")
    @ResponseBody
    @Override
    public JSONObject insertRole(Role role) {
        return roleService.insertRole(role);
    }

    @RequestMapping("/updateRoleById")
    @ResponseBody
    @Override
    public JSONObject updateRoleById(Role role) {
        return roleService.updateRoleById(role);
    }
    @RequestMapping("/delRoleById")
    @ResponseBody
    @Override
    public JSONObject delRoleById(Role role){
        return roleService.delRoleById(role);
    }
}
