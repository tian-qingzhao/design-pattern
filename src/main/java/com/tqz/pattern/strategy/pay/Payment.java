package com.tqz.pattern.strategy.pay;

/**
 * @Author: tian
 * @Date: 2020/4/21 23:25
 * @Desc:
 */
public abstract class Payment {

    public abstract String getName();

    protected abstract double queryBalance(int userId);

    public MsgResult pay(int userId,double amount){
        if (queryBalance(userId) < amount){
            return new MsgResult(500,"支付失败","余额不足");
        }
        return new MsgResult(200,"支付成功","订单金额：" + amount);
    }
}
