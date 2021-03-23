package com.dyh.provider.service.impl;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.dubbo.common.json.JSON;
import com.dyh.common.model.User;
import com.dyh.common.service.UserService;
import com.dyh.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParser;
import org.springframework.stereotype.Service;

/**
 * description: dyh
 * author: Administrator
 * date: 2021/3/15 0015 15:49
 */
@Service
public class UserImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser() {
        System.out.println("类加载了，user进bean池了！！！");
        User user = userMapper.getOne(1);
        System.out.println(user.toString());
        return userMapper.getOne(1);
    }
}
