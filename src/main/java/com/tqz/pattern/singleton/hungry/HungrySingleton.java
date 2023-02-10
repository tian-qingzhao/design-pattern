package com.tqz.pattern.singleton.hungry;

/**
 * @Author: tian
 * @Date: 2020/4/15 17:30
 * @Desc: 饿汉式单例模式
 *        1.私有构造方法
 *        2.创建本类的对象并初始化(私有的)
 *        3.创建静态方法获取本类对象
 *        优点:
 *            保证的线程的安全,没有线程安全问题
 *        缺点:
 *            使用类就会加载,比较消耗内存
 */
public class HungrySingleton {

    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    public HungrySingleton() {
    }

    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }
}
