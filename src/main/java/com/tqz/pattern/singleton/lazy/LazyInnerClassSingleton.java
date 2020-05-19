package com.tqz.pattern.singleton.lazy;

/**
 * @Author: tian
 * @Date: 2020/4/15 19:48
 * @Desc: 使用内容类，底层还是饿汉式模式
 */
public class LazyInnerClassSingleton {

    public LazyInnerClassSingleton() {
        if (LazyHolder.lazyInnerClassSingleton != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    /**
     * 懒汉式单例
     * @return
     */
    public static LazyInnerClassSingleton getInstance(){
        System.out.println("getInstance");
        synchronized (LazyInnerClassSingleton.class){
            return LazyHolder.lazyInnerClassSingleton;
        }
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton lazyInnerClassSingleton = new LazyInnerClassSingleton();
    }
}
