package com.gwf.yuhuangshe.dao;

import com.gwf.yuhuangshe.entity.User;

import java.util.List;

//@Mapper//指定这是一个操作数据库的mapper
public interface UserMapper {
    List<User> login(User user);
}
