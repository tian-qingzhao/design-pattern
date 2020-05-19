package com.tqz.pattern.singleton.lazy;

/**
 * @Author: tian
 * @Date: 2020/4/15 17:59
 * @Desc:
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExcetorThread());
        Thread t2 = new Thread(new ExcetorThread());
        t1.start();
        t2.start();
        System.out.println("=============");
    }
}
