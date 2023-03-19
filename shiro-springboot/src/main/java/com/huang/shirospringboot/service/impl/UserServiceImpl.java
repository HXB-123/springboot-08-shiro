package com.huang.shirospringboot.service.impl;

import com.huang.shirospringboot.mapper.UserMapper;
import com.huang.shirospringboot.pojo.User;
import com.huang.shirospringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User queryUserByName(String name) {

        return userMapper.queryUserByName(name);
    }
}
