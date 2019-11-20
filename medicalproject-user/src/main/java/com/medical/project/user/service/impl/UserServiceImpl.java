package com.medical.project.user.service.impl;

import com.medical.project.user.mapper.UserMapper;
import com.medical.project.common.po.User;
import com.medical.project.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
