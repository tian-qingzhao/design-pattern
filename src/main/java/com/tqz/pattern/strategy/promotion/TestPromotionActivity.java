package com.tqz.pattern.strategy.promotion;

/**
 * @Author: tian
 * @Date: 2020/4/21 22:40
 * @Desc:
 */
public class TestPromotionActivity {

/*    public static void main(String[] args) {
        PromotionAcvtivity promotionAcvtivity618 = new PromotionAcvtivity(new CouponStrategy());
        PromotionAcvtivity promotionAcvtivity1111 = new PromotionAcvtivity(new ReturnMoneyStrategy());
        promotionAcvtivity618.execute();
        promotionAcvtivity1111.execute();
    }*/

   /* public static void main(String[] args) {
        PromotionStrategy promotionStrategy = null;
        String promotionKey = "returnMoney";

        if ("returnMoney".equals(promotionKey)) {
            promotionStrategy = new ReturnMoneyStrategy();
        }else if ("coupon".equals(promotionKey)) {
            promotionStrategy = new CouponStrategy();
        }
        promotionStrategy.doPromotion();
    }*/

    public static void main(String[] args) {
        String promotionKey = "GROUP_BUY";
        System.out.println(PromotionStrategyFactory.PromotionKey.GROUP_BUY);
        PromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(promotionKey);
        PromotionAcvtivity promotionAcvtivity = new PromotionAcvtivity(promotionStrategy);
        promotionAcvtivity.execute();
    }
}
