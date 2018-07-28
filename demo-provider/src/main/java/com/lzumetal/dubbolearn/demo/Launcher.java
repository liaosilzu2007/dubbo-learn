package com.lzumetal.dubbolearn.demo;

import com.lzumetal.dubbolearn.demo.util.BeanFactoryUtil;
import com.lzumetal.dubbolearn.demo.util.SystemDetails;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.InetAddress;

/**
 * Created by liaosi on 2017/9/24.
 */
public class Launcher {


    private static final Log log = LogFactory.getLog(Launcher.class);

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("=======================");
        System.out.println("        Core包启动          ");
        SystemDetails.outputDetails();
        System.out.println("=======================");

        getLocalip();
        // 初始化spring
        log.info("开始初始化core服务");
        ClassPathXmlApplicationContext applicationContext = (ClassPathXmlApplicationContext) BeanFactoryUtil.getContext();
        applicationContext.start();

        try{
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 取得本机ip地址 注意：Spring RmiServiceExporter取得本机ip的方法：InetAddress.getLocalHost()
     */
    private static void getLocalip() {
        try {
            System.out.println("服务暴露的ip: " + InetAddress.getLocalHost().getHostAddress());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
