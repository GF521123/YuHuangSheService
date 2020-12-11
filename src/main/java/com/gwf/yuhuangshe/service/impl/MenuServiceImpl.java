package com.gwf.yuhuangshe.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import com.gwf.yuhuangshe.dao.MenuMapper;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;
    @Override
    public JSONObject selMenu(){

        return null;
    }

}
