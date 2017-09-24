package com.ddcx.dubbolearn.demo.consumer;

import com.ddcx.dubbolearn.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liaosi on 2017/9/24.
 */
public class UserServiceConsumer {

    private static final Logger log = LoggerFactory.getLogger(UserServiceConsumer.class);

    public static void main(String args[]) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Consumer-ApplicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        log.info("执行结果：" + userService.login("hello", "hello"));
    }

}
