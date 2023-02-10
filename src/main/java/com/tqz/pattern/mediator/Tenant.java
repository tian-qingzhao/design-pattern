package com.tqz.pattern.mediator;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/8 11:33
 */
public class Tenant extends Person {
    
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }
    
    public void constact(String msg) {
        mediator.constact(msg, this);
    }
    
    public void getMessage(String msg) {
        System.out.println("租房者：" + name + " 获取到信息：" + msg);
    }
    
}
