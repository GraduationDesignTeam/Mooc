package com.mooc.mooc.service.impl;

import com.mooc.mooc.mapper.UserInfoMapper;
import com.mooc.mooc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;
}
