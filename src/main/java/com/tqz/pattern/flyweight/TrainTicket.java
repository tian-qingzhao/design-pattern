package com.tqz.pattern.flyweight;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/6 10:16
 */
public class TrainTicket implements Ticket {
    
    private String from;
    
    private String to;
    
    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }
    
    @Override
    public void show(String seat, Double price) {
        System.out.println(from + "->" + to + ":" + seat + " 价格：" + price);
    }
}
