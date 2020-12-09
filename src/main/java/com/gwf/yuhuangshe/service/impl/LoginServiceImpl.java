package com.gwf.yuhuangshe.service.impl;

import com.gwf.yuhuangshe.dao.UserMapper;
import com.gwf.yuhuangshe.entity.User;
import com.gwf.yuhuangshe.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int login(User user){
        System.out.println(user.getUName());
        List<User> result  =  userMapper.login(user);
//        System.out.println(result);
        return 1;
    }
}
