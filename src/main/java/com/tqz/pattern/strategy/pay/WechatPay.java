package com.tqz.pattern.strategy.pay;

/**
 * @Author: tian
 * @Date: 2020/4/21 23:29
 * @Desc: 微信支付
 */
public class WechatPay extends Payment{

    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(int userId) {
        return 500;
    }
}
