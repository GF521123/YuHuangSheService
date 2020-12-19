package com.gwf.yuhuangshe.service;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuService {
    List<Menu> menuone(Integer userid);

    List<Menu> menutwo(Integer userid,Menu Menuone);
}
