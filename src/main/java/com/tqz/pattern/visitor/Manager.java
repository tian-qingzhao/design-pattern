package com.tqz.pattern.visitor;

import java.util.Random;

/**
 * <p>管理者，具体元素，被访者
 *
 * @author tianqingzhao
 * @since 2023/2/10 9:27
 */
public class Manager implements Employee {
    
    private String name;
    
    private int kpi;
    
    Manager(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }
    
    public String getName() {
        return name;
    }
    
    public int getKpi() {
        return kpi;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    public int getProductNum() {
        return this.kpi * 10;
    }
}
