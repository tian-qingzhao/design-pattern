package com.tqz.pattern.flyweight;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/6 10:21
 */
public class TestFlyweight {
    
    public static void main(String[] args) {
        Ticket ticket1 = TicketFactory.getTicket("北京", "上海");
        ticket1.show("一等座", 668.1);
    
        Ticket ticket2 = TicketFactory.getTicket("上海", "北京");
        ticket2.show("商务座", 1245.5);
        
        Ticket ticket3 = TicketFactory.getTicket("北京", "上海");
        ticket3.show("商务座", 1298.7);
    
        System.out.println(ticket1 == ticket2);
        System.out.println(ticket1 == ticket3);
    }
    
}
