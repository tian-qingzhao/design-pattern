package com.tqz.pattern.command;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/5 0:35
 */
public class Order {
    
    private int diningTable;
    
    private Map<String, Integer> foodDic = new ConcurrentHashMap<>();
    
    public int getDiningTable() {
        return diningTable;
    }
    
    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }
    
    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }
    
    public void setFoodDic(String name, Integer num) {
        this.foodDic.put(name, num);
    }
}
