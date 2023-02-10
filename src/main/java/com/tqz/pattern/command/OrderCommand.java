package com.tqz.pattern.command;

import java.util.Map;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/5 0:37
 */
public class OrderCommand implements Command {
    
    private SeniorChecf checf;
    
    private Order order;
    
    public OrderCommand(SeniorChecf checf, Order order) {
        this.checf = checf;
        this.order = order;
    }
    
    @Override
    public void executor() {
        Map<String, Integer> foodDic = order.getFoodDic();
        
        for (Map.Entry<String, Integer> food : foodDic.entrySet()) {
            checf.makefood(food.getKey(), food.getValue());
        }
        
        System.out.println(order.getDiningTable() + " 餐桌饭已ok");
    }
}
