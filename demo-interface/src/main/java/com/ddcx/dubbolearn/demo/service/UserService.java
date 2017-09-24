package com.ddcx.dubbolearn.demo.service;

/**
 * Created by liaosi on 2017/9/24.
 */
public interface UserService {

    /**
     * 登录
     * @param username
     * @param password
     * @return 登录是否成功
     */
    public boolean login(String username, String password);
}
