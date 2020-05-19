package com.tqz.pattern.strategy.promotion;

/**
 * @Author: tian
 * @Date: 2020/4/21 22:39
 * @Desc:
 */
public class PromotionAcvtivity {

    PromotionStrategy promotionStrategy;

    public PromotionAcvtivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }

    public void execute(){
        this.promotionStrategy.doPromotion();
    }
}
