package com.tqz.pattern.memento;

/**
 * <p>备忘录模式测试类
 *
 * @author tianqingzhao
 * @since 2023/2/8 15:56
 */
public class TestMemento {
    
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("OFF");
        originator.show();
        
        CreaTaker<Memento> creaTaker = new CreaTaker<>();
        creaTaker.setData(originator.createMenento());
        
        originator.setState("ON");
        originator.show();
        
        originator.setMenento(creaTaker.getData());
        originator.show();
    }
    
}
