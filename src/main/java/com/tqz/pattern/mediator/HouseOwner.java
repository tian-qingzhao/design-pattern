package com.tqz.pattern.mediator;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/8 11:36
 */
public class HouseOwner extends Person {
    
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }
    
    public void constact(String msg) {
        mediator.constact(msg, this);
    }
    
    public void getMessage(String msg) {
        System.out.println("房屋拥有者：" + name + " 获取信息：" + msg);
    }
    
}
