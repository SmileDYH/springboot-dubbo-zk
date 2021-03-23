package com.dyh.common.service;

import com.dyh.common.model.User;

/**
 * description: dyh
 * author: Administrator
 * date: 2021/3/15 0015 15:38
 */
public interface UserService {
    //个人理解：user对象在service里new成对象，或者实例化了，进bean池了；而dubbo只有一个接口层，User还只是一个类（抽象的概念），所以要实例化（具体实例）
    User getUser();
}
