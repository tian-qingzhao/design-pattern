package com.tqz.pattern.singleton.register.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: tian
 * @Date: 2020/4/16 17:26
 * @Desc: Spring中的做法，就是用这种注册式单例
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    /**
     * 这里使用了ConcurrentHashMap，他底层是线程安全的，这里为什么还要使用锁，
     * 因为ConcurrentHashMap是只针对他这个类里面的方法，这里线程不安全的是getBean()方法
     * @param className
     * @return
     */
    public static Object getInstance(String className){
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return ioc.get(className);
            }
        }
    }
}
