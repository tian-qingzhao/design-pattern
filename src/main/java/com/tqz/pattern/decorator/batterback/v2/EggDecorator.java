package com.tqz.pattern.decorator.batterback.v2;

/**
 * @Author: tian
 * @Date: 2020/4/22 21:33
 * @Desc:
 */
public class EggDecorator extends BattercakeDecorator {

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String msg() {
        return super.msg() + " +1个鸡蛋";
    }

    @Override
    public int price() {
        return super.price() + 2;
    }
}
