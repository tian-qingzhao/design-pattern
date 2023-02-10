package com.tqz.pattern.composite;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/4 20:19
 */
public abstract class Menu {
    
    protected String name;
    
    protected Integer level;
    
    public void add(Menu menu) {
        throw new UnsupportedOperationException("不支持添加");
    }
    
    public void remove(Menu menu) {
        throw new UnsupportedOperationException("不支持删除");
    }
    
    public Menu getChile(Integer index) {
        throw new UnsupportedOperationException("不支持获取子菜单");
    }
    
    public String getName() {
        throw new UnsupportedOperationException("不支持获取菜单名称");
    }
    
    public void print() {
        for (int i = 0; i< level; i ++) {
            System.out.print("--");
        }
    
        System.out.println(name);
    }
}

