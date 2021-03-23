package com.dyh.consumer.controller;

import com.dyh.common.model.User;
import com.dyh.common.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * description: dyh
 * author: Administrator
 * date: 2021/3/15 0015 16:07
 */
@RestController
public class UserController {
    @Resource
    @Reference
    private UserService userService;

    @GetMapping("getUser")
    public User user(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
        User user = userService.getUser();
        System.out.println("user");
        return userService.getUser();
    }
}
