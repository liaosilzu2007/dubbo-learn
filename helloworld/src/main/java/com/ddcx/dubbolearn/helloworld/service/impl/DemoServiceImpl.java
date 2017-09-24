package com.ddcx.dubbolearn.helloworld.service.impl;

import com.ddcx.dubbolearn.helloworld.entity.User;
import com.ddcx.dubbolearn.helloworld.service.DemoService;

/**
 * Created by liaosi on 2017/9/22.
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello," + name;
    }

    @Override
    public User findUserById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("小明");
        user.setAge(14);
        return user;
    }
}
