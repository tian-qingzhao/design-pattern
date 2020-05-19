package com.tqz.pattern.decorator.batterback.v2;

/**
 * @Author: tian
 * @Date: 2020/4/22 21:34
 * @Desc:
 */
public class SausageDecorator extends BattercakeDecorator {

    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String msg() {
        return super.msg() + " +1根香肠";
    }

    @Override
    public int price() {
        return super.price() + 2;
    }
}
