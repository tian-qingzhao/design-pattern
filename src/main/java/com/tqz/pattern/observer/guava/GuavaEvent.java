package com.tqz.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Author: tian
 * @Date: 2020/4/23 1:14
 * @Desc:
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe(String str){
        System.out.println("执行subscribe方法，传入的参数是：" + str);
    }

}
