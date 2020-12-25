package com.gwf.yuhuangshe.service;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.Menu;
import com.gwf.yuhuangshe.entity.Role;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface RoleService {
    public JSONObject selRoles(Integer page, Integer pageSize);
    public JSONObject insertRole(Role role);
    public JSONObject updateRoleById(Role role);
    public JSONObject delRoleById(Role role);
}
