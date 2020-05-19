package com.tqz.pattern.singleton.lazy;

import com.tqz.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @Author: tian
 * @Date: 2020/4/15 17:57
 * @Desc:
 */
public class ExcetorThread implements Runnable {

    public void run() {
//        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
//        LazyDoubleCheckSingleton lazySimpleSingleton = LazyDoubleCheckSingleton.getInstance();
//        LazyInnerClassSingleton lazySimpleSingleton = new LazyInnerClassSingleton();
        ThreadLocalSingleton lazySimpleSingleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + lazySimpleSingleton);
    }
}
