package com.tqz.pattern.singleton.hungry;

/**
 * @Author: tian
 * @Date: 2020/4/15 17:30
 * @Desc: 饿汉式单例模式
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton HUNGRY_SINGLETON;

    static {
        HUNGRY_SINGLETON = new HungryStaticSingleton();
    }

    public HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance(){
        return HUNGRY_SINGLETON;
    }
}
