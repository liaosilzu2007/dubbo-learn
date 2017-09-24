package com.ddcx.dubbolearn.demo.service.impl;

import com.ddcx.dubbolearn.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalLookupService;

/**
 * Created by liaosi on 2017/9/24.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);


    @Override
    public boolean login(String username, String password) {
        log.info("用户登录：[username:{}, password:{}]", username, password);
        if (username != null && password != null && username.equals(password)) {
            log.info("用户校验通过。[username:{}]", username);
            return true;
        }
        log.info("用户校验失败！[username:{}]", username);
        return false;
    }

}
