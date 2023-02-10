package com.tqz.pattern.interpreter;

/**
 * <p>非终结表达式，加法类
 *
 * @author tianqingzhao
 * @since 2023/2/6 10:39
 */
public class AddNonTerminal extends NonTerminal {
    
    public AddNonTerminal(Expression left, Expression right) {
        super(left, right);
    }
    
    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
