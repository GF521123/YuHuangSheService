package com.gwf.yuhuangshe.service;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.Menu;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface MenuService {
    public List<Menu> MenuInitGet(@RequestParam("userid")Integer userid);
    public JSONObject selMenus(int page, int pageSize);
}
