package com.lzumetal.dubbolearn.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class SimpleLauncher {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Provider-AplicationContext.xml");
        applicationContext.start();
        System.in.read(); //按任意键退出
    }
}
