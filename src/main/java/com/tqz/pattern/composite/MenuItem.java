package com.tqz.pattern.composite;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/4 20:55
 */
public class MenuItem extends Menu {
    
    public MenuItem(String name, Integer level) {
        this.name = name;
        this.level = level;
    }
    
    @Override
    public void print() {
        super.print();
    }
}
