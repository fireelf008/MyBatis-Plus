package com.wsf.mp.service;

import com.wsf.mp.entity.User;
import com.wsf.mp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return this.userMapper.selectList(null);
    }
}
