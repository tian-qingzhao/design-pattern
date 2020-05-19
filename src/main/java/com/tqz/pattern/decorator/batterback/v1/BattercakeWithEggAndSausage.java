package com.tqz.pattern.decorator.batterback.v1;

/**
 * @Author: tian
 * @Date: 2020/4/22 21:18
 * @Desc:
 */
public class BattercakeWithEggAndSausage extends BattercakeWithEgg {

    @Override
    public int price() {
        return super.price() + 2;
    }

    @Override
    public String msg() {
        return super.msg() + " +1根香肠";
    }
}
