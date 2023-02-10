package com.tqz.pattern.interpreter;

/**
 * <p>非中介表达式抽象类
 *
 * @author tianqingzhao
 * @since 2023/2/6 10:36
 */
public abstract class NonTerminal implements Expression {
    
    protected Expression left;
    
    protected Expression right;
    
    public NonTerminal(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
