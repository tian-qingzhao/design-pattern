package com.tqz.pattern.strategy.pay;

/**
 * @Author: tian
 * @Date: 2020/4/21 23:30
 * @Desc:
 */
public class JDPay extends Payment{

    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(int userId) {
        return 800;
    }
}
