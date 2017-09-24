package com.ddcx.dubbolearn.demo.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liaosi on 2017/9/24.
 */
public class BeanFactoryUtil {

    private static ApplicationContext ctx_producer = null;

    public final static String APPLICATION_CONTEXT_ROOT = "";
    public final static String APPLICATION_CONTEXT_PATH = APPLICATION_CONTEXT_ROOT + "Provider-AplicationContext.xml";

    public static void init() {
        if (ctx_producer == null) {
            synchronized (BeanFactoryUtil.class) {
                if(ctx_producer == null){
                    String[] configLocations = new String[]{APPLICATION_CONTEXT_PATH};
                    ctx_producer = new ClassPathXmlApplicationContext(configLocations);
                }
            }
        }
    }

    public static ApplicationContext getContext() {
        init();
        return ctx_producer;
    }
}
