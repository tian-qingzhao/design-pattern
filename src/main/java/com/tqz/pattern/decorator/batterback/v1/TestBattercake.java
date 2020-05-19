package com.tqz.pattern.decorator.batterback.v1;

/**
 * @Author: tian
 * @Date: 2020/4/22 21:19
 * @Desc: 没有使用设计模式，如果有新的需求，不停的去创建子类，不利于维护
 */
public class TestBattercake {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.msg() + "，总价格：" + battercake.price());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.msg() + "，总价格：" + battercakeWithEgg.price());

        BattercakeWithEggAndSausage battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.msg() + "，总价格：" + battercakeWithEggAndSausage.price());

    }
}
