package com.tqz.pattern.memento;

/**
 * <p>发起人
 *
 * @author tianqingzhao
 * @since 2023/2/8 16:10
 */
public class Originator {
    
    private String state;
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public Memento createMenento() {
        return new Memento(state);
    }
    
    public void setMenento(Memento memento) {
        state = memento.getState();
    }
    
    public void show() {
        System.out.println("当前状态：" + state);
    }
}
