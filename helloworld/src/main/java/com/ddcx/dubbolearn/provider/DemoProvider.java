package com.ddcx.dubbolearn.provider;

import com.ddcx.dubbolearn.consumer.DemoConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by liaosi on 2017/9/22.
 */
public class DemoProvider {


    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo-helloworld-provider.xml");
        applicationContext.start();
        System.in.read();
    }
}
