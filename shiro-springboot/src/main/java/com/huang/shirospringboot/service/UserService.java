package com.huang.shirospringboot.service;

import com.huang.shirospringboot.pojo.User;


public interface UserService {

    User queryUserByName(String name);
}
