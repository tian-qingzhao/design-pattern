package com.tqz.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>如 Spring-Framekwork 里面的 CompositePropertySource，
 * Apache-Configuration 里面的 CompositeConfiguration 都是使用了组合模式。
 *
 * @author tianqingzhao
 * @since 2023/2/4 20:18
 */
public class CompositeMenu extends Menu {
    
    private final List<Menu> list = new ArrayList<>();
    
    public CompositeMenu(String name, Integer level) {
        this.name = name;
        this.level = level;
    }
    
    @Override
    public void add(Menu menu) {
        list.add(menu);
    }
    
    @Override
    public void remove(Menu menu) {
        list.remove(menu);
    }
    
    @Override
    public Menu getChile(Integer index) {
        return list.get(index);
    }
    
    @Override
    public String getName() {
        return super.getName();
    }
    
    @Override
    public void print() {
        super.print();
        
        for (Menu menu : list) {
            menu.print();
        }
    }
}
