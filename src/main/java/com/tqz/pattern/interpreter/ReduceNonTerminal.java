package com.tqz.pattern.interpreter;

/**
 * <p>非终结表达式，减法类
 *
 * @author tianqingzhao
 * @since 2023/2/7 8:33
 */
public class ReduceNonTerminal extends NonTerminal {
    
    public ReduceNonTerminal(Expression left, Expression right) {
        super(left, right);
    }
    
    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
