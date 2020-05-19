package com.tqz.pattern.strategy.promotion;

/**
 * @Author: tian
 * @Date: 2020/4/21 22:35
 * @Desc:
 */
public class GroupBuyStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("拼团活动。。。");
    }
}
