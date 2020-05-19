package com.tqz.pattern.strategy.pay;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @Author: tian
 * @Date: 2020/4/21 23:32
 * @Desc: 策略模式：是指定义了算法家族、分别封装起来，让他们之间可以互相替换，
 *        此模式让算法的变化不会影响到使用算法的用户。
 *
 *        优点：
 *          1.符合开闭原则  2.避免多重条件语句，如if switch  3.提高算法的保密性和安全性
 *        缺点：
 *          1.客户端必须知道所有的策略，并且自行决定使用哪一个策略类
 *          2.代码中会增加非常多的策略类，增加了维护难度
 */
public class TestPayment {

    public static void main(String[] args) {
        Order order = new Order(1,1,701);
        MsgResult pay = order.pay(PayStrategy.ALI_PAY);
        System.out.println(pay);
    }
}
