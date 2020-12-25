package com.gwf.yuhuangshe.dao;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.Menu;
import com.gwf.yuhuangshe.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    List<Role> selRoles();
    int insertRole(Role role);
    int updateRoleById(Role role);
    int delRoleById(Role role);
}
