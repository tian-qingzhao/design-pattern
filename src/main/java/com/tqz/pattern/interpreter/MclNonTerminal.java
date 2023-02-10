package com.tqz.pattern.interpreter;

/**
 * <p>非终结表达式，乘法类
 *
 * @author tianqingzhao
 * @since 2023/2/7 8:31
 */
public class MclNonTerminal extends NonTerminal {
    
    public MclNonTerminal(Expression left, Expression right) {
        super(left, right);
    }
    
    @Override
    public int interpret() {
        return left.interpret() * right.interpret();
    }
}
