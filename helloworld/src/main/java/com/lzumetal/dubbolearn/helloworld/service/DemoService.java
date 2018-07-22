package com.lzumetal.dubbolearn.helloworld.service;

import com.lzumetal.dubbolearn.helloworld.entity.User;

/**
 * Created by liaosi on 2017/9/22.
 */
public interface DemoService {

    String sayHello(String name);
    User findUserById(Long id);

}
