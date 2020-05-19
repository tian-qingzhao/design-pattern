package com.tqz.pattern.strategy.promotion;

/**
 * @Author: tian
 * @Date: 2020/4/21 22:31
 * @Desc: 无优惠
 */
public class NonCouponStrategy implements PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("无优惠活动。。。");
    }
}
