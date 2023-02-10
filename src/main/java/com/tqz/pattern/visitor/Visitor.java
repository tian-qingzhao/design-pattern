package com.tqz.pattern.visitor;

/**
 * <p>抽象访问者
 *
 * @author tianqingzhao
 * @since 2023/2/10 9:26
 */
public interface Visitor {
    
    void visit(Engineer engineer);
    
    void visit(Manager manager);
}
