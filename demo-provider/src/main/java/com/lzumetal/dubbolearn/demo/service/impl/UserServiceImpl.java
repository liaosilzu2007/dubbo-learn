package com.lzumetal.dubbolearn.demo.service.impl;

import com.lzumetal.dubbolearn.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * Created by liaosi on 2017/9/24.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);


    @Override
    public boolean login(String username, String password) {
        log.error("用户登录：[username:{}, password:{}]", username, password);
        if (username != null && password != null && username.equals(password)) {
            log.error("用户校验通过。[username:{}]", username);
            return true;
        }
        log.error("用户校验失败！[username:{}]", username);
        return false;
    }

}
