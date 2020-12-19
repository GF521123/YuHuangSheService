package com.gwf.yuhuangshe.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.dao.UserMapper;
import com.gwf.yuhuangshe.entity.User;
import com.gwf.yuhuangshe.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public JSONObject login(User user){
        List<User> result  =  userMapper.login(user);
        JSONObject resultJson = new JSONObject();
        if(result.size() == 1){
            resultJson.put("code", 0 );
        }else{
            resultJson.put( "code",200 );
        }
        return resultJson;
    }
}