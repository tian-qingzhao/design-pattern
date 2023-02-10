package com.tqz.pattern.interpreter;

/**
 * <p>终结表达式
 *
 * @author tianqingzhao
 * @since 2023/2/6 10:34
 */
public class NumberTerminal implements Expression {
    
    private final int number;
    
    public NumberTerminal(int number) {
        this.number = number;
    }
    
    @Override
    public int interpret() {
        return number;
    }
}
