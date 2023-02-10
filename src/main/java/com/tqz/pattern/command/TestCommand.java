package com.tqz.pattern.command;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/5 0:37
 */
public class TestCommand {
    
    public static void main(String[] args) {
        Waitor waitor = new Waitor();
    
        SeniorChecf seniorChecf = new SeniorChecf();
        
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFoodDic("可乐", 1);
        order1.setFoodDic("鸡蛋面", 2);
        waitor.addCommand(new OrderCommand(seniorChecf, order1));
    
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFoodDic("雪碧", 1);
        order2.setFoodDic("刀削面", 2);
        waitor.addCommand(new OrderCommand(seniorChecf, order2));
        
        waitor.orderUp();
    }
}
