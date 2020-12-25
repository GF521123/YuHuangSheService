package com.gwf.yuhuangshe.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gwf.yuhuangshe.dao.MenuMapper;
import com.gwf.yuhuangshe.dao.RoleMapper;
import com.gwf.yuhuangshe.entity.Menu;
import com.gwf.yuhuangshe.entity.Role;
import com.gwf.yuhuangshe.service.MenuService;
import com.gwf.yuhuangshe.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public JSONObject selRoles(Integer page, Integer pageSize){
        JSONObject resultJson = new JSONObject();
        PageHelper.startPage(page, pageSize);
        List<Role> roleList = roleMapper.selRoles();
        PageInfo<Role> pageInfo = new PageInfo<>(roleList);

        resultJson.put("total",pageInfo.getTotal());
        resultJson.put("rows",pageInfo.getList());
        return resultJson;
    }

    @Override
    public JSONObject insertRole(Role role) {
        JSONObject resultJson = new JSONObject();
        int resultInsert = roleMapper.insertRole( role);
        resultJson.put("code",0);
        if(resultInsert == 1){
            resultJson.put("msg","新建成功");
        }else{
            resultJson.put("msg","新建失败");
        }
        return resultJson;
    }
    @Override
    public JSONObject updateRoleById(Role role){
        JSONObject resultJson = new JSONObject();
        int resultUpdate = roleMapper.updateRoleById( role);
        resultJson.put("code",0);
        if(resultUpdate == 1){
            resultJson.put("msg","修改成功");
        }else{
            resultJson.put("msg","修改失败");
        }
        return resultJson;
    }

    @Override
    public JSONObject delRoleById(Role role){
        JSONObject resultJson = new JSONObject();
        int resultUpdate = roleMapper.delRoleById( role);
        resultJson.put("code",0);
        if(resultUpdate == 1){
            resultJson.put("msg","删除成功");
        }else{
            resultJson.put("msg","删除失败");
        }
        return resultJson;
    }
}
