package com.tqz.pattern.decorator.batterback.v1;

/**
 * @Author: tian
 * @Date: 2020/4/22 21:16
 * @Desc:
 */
public class BattercakeWithEgg extends Battercake {

    //加鸡蛋就加两元
    @Override
    public int price() {
        return super.price() + 2;
    }

    @Override
    public String msg() {
        return super.msg() + "+1个鸡蛋";
    }
}
