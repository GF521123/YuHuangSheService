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

}
