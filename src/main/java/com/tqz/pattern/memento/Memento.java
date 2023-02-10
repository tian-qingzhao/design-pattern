package com.tqz.pattern.memento;

/**
 * <p>备忘录类
 *
 * @author tianqingzhao
 * @since 2023/2/8 16:08
 */
public class Memento {
    
    private String state;
    
    public Memento(String state) {
        super();
        this.state = state;
    }
    
    public String getState() {
        return state;
    }
}
