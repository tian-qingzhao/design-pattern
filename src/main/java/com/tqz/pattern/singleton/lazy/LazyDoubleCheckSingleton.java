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
 *
 *        使用双重锁
 */
public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton lazySimpleSingleton;

    public LazyDoubleCheckSingleton() {

    }

    /**
     * 把锁放在方法里面，但是可能还会出现new两次的问题，这时候再加一层if判断，相当于双重锁
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance(){
        if (lazySimpleSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazySimpleSingleton == null){
                    lazySimpleSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySimpleSingleton;
    }
}
