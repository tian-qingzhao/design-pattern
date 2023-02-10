package com.tqz.pattern.singleton.lazy;

/**
 * @Author: tian
 * @Date: 2020/4/15 17:54
 * @Desc: 1.私有构造方法
 *        2.创建本类对象,但不初始化
 *        3.创建静态方法进行初始化对象并返回
 *        优点:
 *           使用到类的对象才会加载,不消耗内存
 *        缺点:
 *           可能会出现线程安全问题,但是可以使用同步代码块消除这个安全问题
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton;

    public LazySimpleSingleton() {

    }

    /**
     * 尽管使用了同步代码块，但还是可能会出现问题，这时候会把整个类的对象给锁死，因为static方法是针对的类
     * @return
     */
    public static synchronized LazySimpleSingleton getInstance(){
        if (lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
