package com.tqz.pattern.visitor;

import java.util.Random;

/**
 * <p>工程师，具体元素，被访问者
 *
 * @author tianqingzhao
 * @since 2023/2/10 9:27
 */
public class Engineer implements Employee {
    
    private String name;
    
    private int kpi;
    
    public Engineer(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    public String getName() {
        return name;
    }
    
    public int getKpi() {
        return kpi;
    }
    
    public int getCodeLineTotal(){
        return this.kpi * 1000000;
    }
}
