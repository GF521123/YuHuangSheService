package com.gwf.yuhuangshe.controller;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.Menu;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface MenuController {
    public List<Menu> MenuInitGet(@RequestParam("userid")Integer userid);
    public JSONObject selMenus(int page, int pageSize);
}
