package com.ddcx.dubbolearn.helloworld.service;

import com.ddcx.dubbolearn.helloworld.entity.User;

/**
 * Created by liaosi on 2017/9/22.
 */
public interface DemoService {

    String sayHello(String name);
    User findUserById(Long id);

}
