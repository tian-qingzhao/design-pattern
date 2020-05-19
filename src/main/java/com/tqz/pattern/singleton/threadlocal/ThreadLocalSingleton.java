package com.tqz.pattern.singleton.threadlocal;

/**
 * @Author: tian
 * @Date: 2020/4/16 17:53
 * @Desc: ThreadLoacl是为线程伪安全，就是同一个线程的时候，能保证获取到的对象是唯一的，
 *        不同的线程获取到的对象可能是不一样的。
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
