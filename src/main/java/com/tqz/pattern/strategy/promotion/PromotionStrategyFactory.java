package com.tqz.pattern.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: tian
 * @Date: 2020/4/21 22:53
 * @Desc:
 */
public class PromotionStrategyFactory {

    private static Map<PromotionKey,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<PromotionKey,PromotionStrategy>();

    //注册式单例模式，而且是恶汉模式
    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.RETURN_MONEY,new ReturnMoneyStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON,new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.NON_COUPON,new NonCouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUP_BUY,new GroupBuyStrategy());
    }

    public PromotionStrategyFactory() {

    }

    //工厂模式
    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? PROMOTION_STRATEGY_MAP.get(PromotionKey.NON_COUPON) : promotionStrategy;
    }

    public enum PromotionKey{
        RETURN_MONEY("RETURN_MONEY"),
        COUPON("COUPON"),
        GROUP_BUY("GROUP_BUY"),
        NON_COUPON("NON_COUPON");

        private final String key;

        private PromotionKey(String key){
            this.key = key;
        }
    }
}
