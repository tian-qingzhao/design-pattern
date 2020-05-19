package com.tqz.pattern.decorator.batterback.v2;

/**
 * @Author: tian
 * @Date: 2020/4/22 21:26
 * @Desc:
 */
public class BaseBattercake extends Battercake {

    @Override
    public String msg() {
        return "煎饼";
    }

    @Override
    public int price() {
        return 5;
    }
}
