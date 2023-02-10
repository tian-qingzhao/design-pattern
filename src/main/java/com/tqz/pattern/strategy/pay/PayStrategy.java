package com.tqz.pattern.strategy.pay;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: tian
 * @Date: 2020/4/22 0:05
 * @Desc:
 */
public class PayStrategy {

    public static final String ALI_PAY = "AliPay";
    public static final String WECHAT_PAY = "WECHAT_PAY";
    public static final String JD_PAY = "JD_PAY";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static Map<String,Payment> payStrategyMap = new HashMap<String,Payment>();

    static {
        payStrategyMap.put(ALI_PAY,new AliPay());
        payStrategyMap.put(WECHAT_PAY,new WechatPay());
        payStrategyMap.put(JD_PAY,new JDPay());
    }

    //统一入口实现策略模式
    public static Payment getPayment(String payKey){
        if (!payStrategyMap.containsKey(payKey)){
            return payStrategyMap.get(DEFAULT_PAY);
        }
        return payStrategyMap.get(payKey);
    }
}
