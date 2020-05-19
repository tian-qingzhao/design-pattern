package com.tqz.pattern.strategy.pay;

/**
 * @Author: tian
 * @Date: 2020/4/21 23:28
 * @Desc:
 */
public class AliPay extends Payment{

    @Override
    public String getName() {
        return "阿里支付";
    }

    @Override
    protected double queryBalance(int userId) {
        return 700;
    }
}
