package com.tqz.pattern.decorator.batterback.v2;

/**
 * @Author: tian
 * @Date: 2020/4/22 21:30
 * @Desc:
 */
public abstract class BattercakeDecorator extends Battercake{

    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    public String msg() {
        return this.battercake.msg();
    }

    @Override
    public int price() {
        return this.battercake.price();
    }
}
