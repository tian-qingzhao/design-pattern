package com.tqz.pattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/6 10:18
 */
public class TicketFactory {
    
    private static final Map<String, Ticket> CACHE = new ConcurrentHashMap<>();
    
    public static Ticket getTicket(String from, String to) {
        String key = from + "->" + to;
        return CACHE.computeIfAbsent(key, k -> new TrainTicket(from, to));
    }
    
}
