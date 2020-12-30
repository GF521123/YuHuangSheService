package com.gwf.yuhuangshe.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.dao.UserMapper;
import com.gwf.yuhuangshe.entity.User;
import com.gwf.yuhuangshe.service.UserLoginService;
import com.gwf.yuhuangshe.utils.CryptoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public JSONObject login(HttpServletRequest request, User user){
        user.setUPassword(CryptoUtil.encode(user.getUPassword()));
        List<User> result  =  userMapper.login(user);
        JSONObject resultJson = new JSONObject();
        if(result.size() == 1){
            resultJson.put("code", 0 );
            resultJson.put("userid", result.get(0).getUId() );
            HttpSession session = request.getSession();
            session.setAttribute("userlogin", result.get(0));
        }else{
            resultJson.put( "code",200 );
        }
        return resultJson;
    }
}
