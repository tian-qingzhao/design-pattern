package com.tqz.pattern.decorator.batterback.v2;

/**
 * @Author: tian
 * @Date: 2020/4/22 21:38
 * @Desc:
 */
public class TestBattercakeDecorator {

    public static void main(String[] args) {
        Battercake battercake;
        //买一个煎饼
        battercake = new BaseBattercake();
        //在加一个鸡蛋
        battercake = new EggDecorator(battercake);
        //再加一个鸡蛋
        battercake = new EggDecorator(battercake);
        //再加一个香肠
        battercake = new SausageDecorator(battercake);
        System.out.println(battercake.msg() + "，价格为：" + battercake.price());


    }
}
