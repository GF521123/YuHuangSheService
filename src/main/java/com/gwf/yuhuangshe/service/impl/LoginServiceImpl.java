package com.gwf.yuhuangshe.service.impl;

import com.gwf.yuhuangshe.dao.UserDao;
import com.gwf.yuhuangshe.entity.User;
import com.gwf.yuhuangshe.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    private UserDao userDao;

    public String login(User user){
        return userDao.login(user);
    }
}
