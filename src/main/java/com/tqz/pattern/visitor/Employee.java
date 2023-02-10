package com.tqz.pattern.visitor;

/**
 * <p>抽象元素，被访问者
 *
 * @author tianqingzhao
 * @since 2023/2/10 9:25
 */
public interface Employee {
    
    void accept(Visitor visitor);
    
}
