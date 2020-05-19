package com.tqz.pattern.strategy.pay;

/**
 * @Author: tian
 * @Date: 2020/4/21 23:21
 * @Desc:
 */
public class Order {

    private int userId;
    private int orderId;
    private double amount;

    public Order(int userId, int orderId, double amount) {
        this.userId = userId;
        this.orderId = orderId;
        this.amount = amount;
    }

    public MsgResult pay(String payKey){
        Payment payment = PayStrategy.getPayment(payKey);
        System.out.println("欢迎使用："+ payment.getName());
        System.out.println("本次交易金额为：" + amount + ",开始扣款。。。。。。");
        return payment.pay(userId,amount);
    }
}
