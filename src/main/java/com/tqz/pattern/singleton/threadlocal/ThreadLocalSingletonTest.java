package com.tqz.pattern.singleton.threadlocal;

import com.tqz.pattern.singleton.lazy.ExcetorThread;

/**
 * @Author: tian
 * @Date: 2020/4/16 17:55
 * @Desc: 
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {

        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExcetorThread());
        Thread t2 = new Thread(new ExcetorThread());
        t1.start();
        t2.start();
        System.out.println("End");

    }
}
