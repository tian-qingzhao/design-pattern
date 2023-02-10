package com.tqz.pattern.mediator;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/8 11:31
 */
public class Person {
    
    protected String name;
    
    protected Mediator mediator;
    
    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
    
}
