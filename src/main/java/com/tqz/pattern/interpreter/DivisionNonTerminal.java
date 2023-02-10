package com.tqz.pattern.interpreter;

/**
 * <p>非终结表达式，除法类
 *
 * @author tianqingzhao
 * @since 2023/2/7 8:29
 */
public class DivisionNonTerminal extends NonTerminal {
    
    public DivisionNonTerminal(Expression left, Expression right) {
        super(left, right);
    }
    
    @Override
    public int interpret() {
        return left.interpret() / right.interpret();
    }
}
