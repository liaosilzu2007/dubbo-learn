package com.ddcx.dubbolearn.consumer;

import com.ddcx.dubbolearn.entity.User;
import com.ddcx.dubbolearn.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liaosi on 2017/9/22.
 */
public class DemoConsumer {

    private static final Logger log = LoggerFactory.getLogger(DemoConsumer.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext aplicationContext = new ClassPathXmlApplicationContext("dubbo-helloworld-consumer.xml");
        aplicationContext.refresh();
        aplicationContext.start();

        //获取用于远程服务调用的代理对象
        DemoService demoService = (DemoService) aplicationContext.getBean("demoService");

        //执行远程调用
        String hello = demoService.sayHello("Lilei");

        //打印调用结果
        log.error("调用 sayHello 方法的结果：{}",hello);

        System.out.println("-------------------------------");
        User user = demoService.findUserById(3234L);
        log.error("调用 findUserById 方法的结果：{}",user);

    }
}
