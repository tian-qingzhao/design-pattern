package com.tqz.pattern.strategy.promotion;

/**
 * @Author: tian
 * @Date: 2020/4/21 22:34
 * @Desc:
 */
public class ReturnMoneyStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("返现促销。。。");
    }
}
